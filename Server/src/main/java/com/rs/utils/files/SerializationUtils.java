package com.rs.utils.files;

import org.pmw.tinylog.Logger;

import java.io.*;

/**
 * Created on 21.4.2017.
 */
public class SerializationUtils {

    public static void serialize(String target, Object object) {
        File targetFile = new File(target);
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(targetFile))) {
            if(!targetFile.exists())
                if(!targetFile.createNewFile()) throw new IOException("Error creating file!");
            output.writeObject(object);
        } catch (IOException e) {
            e.printStackTrace();
            Logger.error("Error writing object to file!");
        }
    }

    public static Object deserialize(String target) {
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(target))) {
            return input.readObject();
        } catch (IOException | ClassNotFoundException e) {
            Logger.error("Error loading object from file!");
        }
        return null;
    }
}
