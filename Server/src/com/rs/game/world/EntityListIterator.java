/*
 * Copyright (C) 2008  RS2DBase Development team
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.rs.game.world;

import java.util.Iterator;
import java.util.Set;

public class EntityListIterator<E extends Entity> implements Iterator<E> {

    private int curIndex = 0;

    private EntityList entityList;

    private Integer[] indices;
    private Object[] entities;

    EntityListIterator(Object[] entities, Set<Integer> indices, @SuppressWarnings("rawtypes") EntityList entityList) {
        this.entities = entities;
        this.indices = indices.toArray(new Integer[indices.size()]);
        this.entityList = entityList;
    }

    public boolean hasNext() {
        return indices.length != curIndex;
    }

    @SuppressWarnings("unchecked")
    public E next() {
        Object temp = entities[indices[curIndex]];
        curIndex++;
        return (E) temp;
    }

    public void remove() {
        if (curIndex >= 1) {
            entityList.remove(indices[curIndex - 1]);
        }
    }
}
