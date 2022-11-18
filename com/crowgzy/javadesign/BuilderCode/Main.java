package com.crowgzy.javadesign.BuilderCode;

import com.crowgzy.javadesign.BuilderCode.concreteBuilder.HtmlBuilder;
import com.crowgzy.javadesign.BuilderCode.concreteBuilder.TextBuilder;
import com.crowgzy.javadesign.BuilderCode.concreteBuilder.javaClassBuilder;

public class Main {
    public static void main(String[] args) {
        //生成纯文本
        TextBuilder textBilder = new TextBuilder();
        Director director = new Director(textBilder);
        director.construct();
        String result = textBilder.getResult();
        System.out.println(result);
        //生成 HTML
        HtmlBuilder htmlBuilder = new HtmlBuilder();
        Director director2 = new Director(htmlBuilder);
        director2.construct();
        String fileName = htmlBuilder.getResult();
        System.out.println(fileName + " 文件编写完成。");

        //生成 HTML
        javaClassBuilder javaClassBuilder = new javaClassBuilder();
        Director director3 = new Director(javaClassBuilder);
        director3.construct();
        String fileName1 = javaClassBuilder.getResult();
        System.out.println(fileName1 + " 文件编写完成。");
    }

}