package com.crowgzy.javadesign.AbstractFactoryCode.factory;

/**
 * @className: Link
 * @author: crowgzy
 * @date: 2022/11/20
 * @apiNote 抽象零件类
 **/
public abstract class Link extends Item{
    protected String url;
    public Link(String caption,String url) {
        super(caption);
        this.url = url;
    }
}
