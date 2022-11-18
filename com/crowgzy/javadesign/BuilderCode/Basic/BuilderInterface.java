package com.crowgzy.javadesign.BuilderCode.Basic;

/**
 * @className: Builder
 * @author: crowgzy
 * @date: 2022/11/18
 **/
public interface BuilderInterface {

     void makeTitle(String title);

    void makeString(String str);

    void makeItem(String[] items);

    void close();
}
