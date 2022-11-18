package com.crowgzy.javadesign.BuilderCode.concreteBuilder;

import com.crowgzy.javadesign.BuilderCode.Basic.Builder;
import com.crowgzy.javadesign.BuilderCode.Basic.BuilderInterface;

public class TextBuilderByInterface implements BuilderInterface {
    private StringBuffer buffer = new StringBuffer();
    @Override
    public void makeTitle(String title) {
        buffer.append("===============================\n");
        buffer.append("[" + title + "]\n");
        buffer.append("\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append('◼' + str + "\n");
        buffer.append("\n");
    }

    @Override
    public void makeItem(String[] items) {
        for(int i = 0; i < items.length; i++) {
            buffer.append("    ." + items[i] + "\n");
        }
        buffer.append("\n");
    }

    @Override
    public void close() {
        buffer.append("===============================\n");
    }

    public String getResult() {
        return buffer.toString();
    }
}