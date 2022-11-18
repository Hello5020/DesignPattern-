package com.crowgzy.javadesign.BuilderCode.concreteBuilder;

import com.crowgzy.javadesign.BuilderCode.Basic.Builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HtmlBuilder extends Builder {
    private String fileName;
    private PrintWriter writer;
    @Override
    public void makeTitle(String title,boolean flag) {
        if (flag) {
            return;
        }
        fileName = title + ".html";
        try {
            writer = new PrintWriter(new FileWriter(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>" + title + "</title></head><body>");
        writer.println("<h1>" + title + "</h1>");
    }

    @Override
    public void makeString(String str) {
        writer.println("<p>" + str + "</p>");
    }

    @Override
    public void makeItem(String[] items) {
        writer.println("<ul>");
        for(int i = 0; i < items.length; i++) {
            writer.println("<li>" + items[i] + "</li>");
        }
        writer.println("</ul>");
    }

    @Override
    public void close() {
        writer.println("</body></html>");
        writer.close();
    }

    public String getResult() {
        return fileName;
    }
}
