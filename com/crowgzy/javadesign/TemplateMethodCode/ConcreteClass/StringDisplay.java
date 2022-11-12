package com.crowgzy.javadesign.TemplateMethodCode.ConcreteClass;

import com.crowgzy.javadesign.TemplateMethodCode.TemplateClass.AbstractDisplay;

/**
 * @className: StringDisplay
 * @author: crowgzy
 * @date: 2022/11/12
 **/
public class StringDisplay extends AbstractDisplay {
    private String string;

    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    public void open() {
        System.out.println("+-----+");
    }

    @Override
    public void close() {
        System.out.println("+-----+");
    }

    @Override
    public void print() {
        System.out.println("|"+string+"|");
    }
}
