package com.crowgzy.javadesign.TemplateMethodCode;

import com.crowgzy.javadesign.TemplateMethodCode.ConcreteClass.CharDisplay;
import com.crowgzy.javadesign.TemplateMethodCode.ConcreteClass.StringDisplay;
import com.crowgzy.javadesign.TemplateMethodCode.TemplateClass.AbstractDisplay;

/**
 * @className: Main
 * @author: crowgzy
 * @date: 2022/11/12
 * @apiNote TemplateMethod模式(以字符和字符串类型的不同输出为例)
 **/
public class Main {
    public static void main(String[] args) {
        AbstractDisplay charDisplay = new CharDisplay('a');
        StringDisplay stringDisplay = new StringDisplay("hello,world!");
        charDisplay.display();
        stringDisplay.display();
    }
}
