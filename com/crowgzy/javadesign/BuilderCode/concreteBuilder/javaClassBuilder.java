package com.crowgzy.javadesign.BuilderCode.concreteBuilder;

import com.crowgzy.javadesign.BuilderCode.Basic.Builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class javaClassBuilder extends Builder {
    private String fileName;
    private PrintWriter writer;
    @Override
    public void makeTitle(String title,boolean flag) {
        if (flag) {
            return;
        }
        fileName = title + ".java";
        try {
            writer = new PrintWriter(new FileWriter(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("public" + " " + "class" + " " + title +  " " +  "{");
    }

    @Override
    public void makeString(String str) {
        writer.println("String" +  " " + "str" + "=" +  "\"" + str + "\"" + ";" );
    }

    @Override
    public void makeItem(String[] items) {
        for(int i = 0; i < items.length; i++) {
            writer.println("String" +  " " + "str" + "=" + "\"" + items[i] + "\""+ ";" );
        }
    }

    @Override
    public void close() {
        writer.println("}");
        writer.close();
    }

    public String getResult() {
        return fileName;
    }
}
