package com.crowgzy.javadesign.AbstractFactoryCode.listFactory;

import com.crowgzy.javadesign.AbstractFactoryCode.factory.Item;
import com.crowgzy.javadesign.AbstractFactoryCode.factory.Tray;

import java.util.Iterator;

/**
 * @className: ListTary
 * @author: crowgzy
 * @date: 2022/11/20
 * @apiNote 表示具体零件
 **/
public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder builder = new StringBuilder();
        builder.append("<li>\n");
        builder.append(caption).append("\n");
        builder.append("<ul>\n");
       // trays.forEach((Item)tray -> builder.append((Item)tray.makeHTML()));
        Iterator iterator  = trays.iterator();
        while (iterator.hasNext()){
            Item item = (Item) iterator.next();
            builder.append(item.makeHTML());
        }
        builder.append("</ul>\n");
        builder.append("</li>\n");
        return builder.toString();
    }
}

