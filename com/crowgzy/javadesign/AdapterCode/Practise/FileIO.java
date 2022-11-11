package com.crowgzy.javadesign.AdapterCode.Practise;

import java.io.IOException;

/**
 * @className: FileIO
 * @author: crowgzy
 * @date: 2022/11/11
 **/
public interface FileIO {
    public void readFromFile(String filename) throws IOException;
    public void writeToFile(String filename) throws IOException;
    public void setValue(String key,String value);
    public String getValue(String key);
}
