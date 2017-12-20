package com.rs.game.world;

import java.util.AbstractCollection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EntityList<T extends Entity> extends AbstractCollection<T> {
    private static final int MIN_VALUE = 1;

    private final Object lock = new Object();

    private int curIndex = MIN_VALUE;
    private int capacity;

    private Set<Integer> indices = new HashSet<>();
    private Entity[] entities;

    public EntityList(int capacity) {
        entities = new Entity[capacity];
        this.capacity = capacity;
    }

    public boolean add(T entity) {
        synchronized (lock) {
            add(entity, curIndex);
            return true;
        }
    }

    public void remove(T entity) {
        synchronized (lock) {
            entities[entity.getIndex()] = null;
            indices.remove(entity.getIndex());
            decreaseIndex();
        }
    }

    @SuppressWarnings("unchecked")
    public T remove(int index) {
        synchronized (lock) {
            Object temp = entities[index];
            entities[index] = null;
            indices.remove(index);
            decreaseIndex();
            return (T) temp;
        }
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        synchronized (lock) {
            if (index >= entities.length) return null;
            return (T) entities[index];
        }
    }

    public void add(T entity, int index) {
        if (entities[curIndex] != null) {
            increaseIndex();
            add(entity, curIndex);
        } else {
            entities[curIndex] = entity;
            entity.setIndex(index);
            indices.add(curIndex);
            increaseIndex();
        }
    }

    public Iterator<T> iterator() {
        synchronized (lock) {
            return new EntityListIterator<>(entities, indices, this);
        }
    }

    private void increaseIndex() {
        curIndex++;
        if (curIndex >= capacity) {
            curIndex = MIN_VALUE;
        }
    }

    private void decreaseIndex() {
        curIndex--;
        if (curIndex <= capacity) curIndex = MIN_VALUE;
    }

    public boolean contains(T entity) {
        return indexOf(entity) > -1;
    }

    private int indexOf(T entity) {
        for (int index : indices) {
            if (entities[index].equals(entity)) {
                return index;
            }
        }
        return -1;
    }

    public int size() {
        return indices.size();
    }
}
