package com.crowgzy.javadesign.TemplateMethodCode.ConcreteClass;

import com.crowgzy.javadesign.TemplateMethodCode.TemplateClass.AbstractDisplay;

/**
 * @className: CharDisplay
 * @author: crowgzy
 * @date: 2022/11/12
 **/
public class CharDisplay extends AbstractDisplay {
    private char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void close() {
        System.out.println(">>");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }
}
