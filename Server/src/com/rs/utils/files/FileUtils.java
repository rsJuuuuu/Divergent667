package com.rs.utils.files;

import com.rs.game.actionHandling.Handler;
import org.pmw.tinylog.Logger;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Peng on 17.9.2016.
 */
public class FileUtils {

    /**
     * Find all classes extending @param keyClass
     *
     * @param directory   where to start looking?
     * @param packageName package at that point
     * @param keyClass    the class we are looking for
     * @return list of class instances extending keyClass
     */
    public static List<Object> getScriptObjects(File directory, String packageName, Class keyClass) {
        List<Object> classes = new ArrayList<>();
        if (!directory.exists()) {
            return classes;
        }
        File[] files = directory.listFiles();
        if (files != null) for (File file : files) {
            if (file.isDirectory()) {
                assert !file.getName().contains(".");
                classes.addAll(getScriptObjects(file, packageName + "." + file.getName(), keyClass));
            } else if (file.getName().endsWith(".class")) {
                try {
                    Class cs = Class.forName(packageName + '.' + file.getName().substring(0,
                            file.getName().length() - 6), false, ClassLoader.getSystemClassLoader());
                    if (cs != null && cs != Handler.class && keyClass.isAssignableFrom(cs))
                        classes.add(cs.newInstance());
                } catch (ExceptionInInitializerError | ClassNotFoundException | InstantiationException |
                        IllegalAccessException e) {
                    e.printStackTrace();
                    Logger.warn("Failed to load " + packageName + "." + file.getName().substring(0,
                            file.getName().length() - 6) + ". (This is likely to be harmless.)");
                }
            }
        }
        return classes;
    }

    public static List<Class> getClasses(File directory, String packageName) throws ClassNotFoundException {
        List<Class> classes = new ArrayList<>();
        if (!directory.exists()) {
            return classes;
        }
        File[] files = directory.listFiles();
        if (files != null) for (File file : files) {
            if (file.isDirectory()) {
                assert !file.getName().contains(".");
                classes.addAll(getClasses(file, packageName + "." + file.getName()));
            } else if (file.getName().endsWith(".class")) {
                try {
                    Class cs = Class.forName(
                            packageName + '.' + file.getName().substring(0, file.getName().length() - 6));
                    classes.add(cs);
                } catch (ExceptionInInitializerError e) {
                    System.err.println("Error loading class" + packageName + "." + file.getName().substring(0,
                            file.getName().length() - 6));
                }
            }
        }
        return classes;
    }

    /**
     * Delete a file
     *
     * @param path to file
     */
    public static void deleteFile(String path) {
        File file = new File(path);
        if (file.exists()) if (!file.delete()) Logger.error("Error deleting file: " + path);
    }
}
