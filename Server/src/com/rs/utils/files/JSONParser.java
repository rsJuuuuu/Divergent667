package com.rs.utils.files;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;

public class JSONParser {

    private static Gson GSON;

    static {
        GSON = new GsonBuilder().enableComplexMapKeySerialization().serializeNulls().setDateFormat(DateFormat.LONG)
                .setFieldNamingPolicy(FieldNamingPolicy.IDENTITY).create();
    }

    public static Object load(String dir, Type type) {
        try (Reader reader = Files.newBufferedReader(Paths.get(dir))) {
            return GSON.fromJson(reader, type);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void save(Object src, String dir, Type type) {
        try (Writer writer = Files.newBufferedWriter(Paths.get(dir))) {
            writer.write(GSON.toJson(src, type));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
