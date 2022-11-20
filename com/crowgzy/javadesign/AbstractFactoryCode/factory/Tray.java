package com.crowgzy.javadesign.AbstractFactoryCode.factory;

import java.util.ArrayList;

/**
 * @className: Tray
 * @author: crowgzy
 * @date: 2022/11/20
 * @apiNote 抽象零件类
 **/
public abstract class Tray extends Item{
    protected ArrayList trays = new ArrayList<>();
    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item){
        trays.add(item);
    }
}
