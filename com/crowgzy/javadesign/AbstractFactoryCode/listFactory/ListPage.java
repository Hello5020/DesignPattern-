package com.crowgzy.javadesign.AbstractFactoryCode.listFactory;

import com.crowgzy.javadesign.AbstractFactoryCode.factory.Item;
import com.crowgzy.javadesign.AbstractFactoryCode.factory.Page;

import java.util.Iterator;


/**
 * @className: ListPage
 * @author: crowgzy
 * @date: 2022/11/20
 * @apiNote 表示具体零件
 **/
public class ListPage extends Page {

    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder builder = new StringBuilder();
        builder.append("<html><head><title>").append(title).append("</title></head>\n");
        builder.append("<body>\n");
        builder.append("<h1>").append(title).append("</h1>\n");
       // content.forEach((Item)e -> builder.append(e.makeHTML()));
        Iterator iterator  = content.iterator();
        while (iterator.hasNext()){
            Item item = (Item) iterator.next();
            builder.append(item.makeHTML());
        }
        builder.append("</ul>\n");
        builder.append("<hr><address>").append(author).append("</address>");
        builder.append("</body></html>\n");
        return builder.toString();
    }
}

