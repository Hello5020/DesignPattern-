package com.crowgzy.javadesign.AdapterCode.Practise;

import java.io.IOException;

/**
 * @className: Main
 * @author: crowgzy
 * @date: 2022/11/11
 * @apiNote 以java.util.Properties为被适配者,创建适配器FileProperties,其中目标对象为FileIO;
 **/
public class Main {
    public static void main(String[] args) {
        FileIO fileIO = new FileProperties();
        try {
            fileIO.readFromFile("file.txt");
            fileIO.setValue("year","2022");
            fileIO.setValue("month","11");
            fileIO.setValue("day","11");
            fileIO.writeToFile("newfile.txt");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
