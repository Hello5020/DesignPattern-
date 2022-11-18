package com.crowgzy.javadesign.BuilderCode.Basic;

/**
 * @className: Builder
 * @author: crowgzy
 * @date: 2022/11/18
 **/
public abstract class Builder {

    public static boolean flag = false;

    public abstract void makeTitle(String title,boolean flag);

    public abstract void makeString(String str);

    public abstract void makeItem(String[] items);

    public abstract void close();
}
