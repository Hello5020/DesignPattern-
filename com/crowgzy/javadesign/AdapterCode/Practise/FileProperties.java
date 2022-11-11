package com.crowgzy.javadesign.AdapterCode.Practise;

import java.io.*;
import java.util.*;

/**
 * @className: FileProperties
 * @author: crowgzy
 * @date: 2022/11/11
 **/
public class FileProperties implements FileIO{
    private OutputStream outputStream =null;
    private InputStream inputStream = null;
    private Properties properties = new Properties();

    @Override
    public void readFromFile(String filename) throws IOException {
        inputStream = new FileInputStream(new File(filename));
        properties.load(inputStream);
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        outputStream = new FileOutputStream(new File(filename));
        properties.store(outputStream,
                "written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        properties.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return properties.getProperty(key);
    }
}
