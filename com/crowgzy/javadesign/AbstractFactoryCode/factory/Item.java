package com.crowgzy.javadesign.AbstractFactoryCode.factory;

/**
 * @className: Item
 * @author: crowgzy
 * @date: 2022/11/20
 * @apiNote 方便统一处理抽象零件类
 **/
public abstract class Item {
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
