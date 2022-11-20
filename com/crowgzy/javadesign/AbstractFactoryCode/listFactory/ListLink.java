package com.crowgzy.javadesign.AbstractFactoryCode.listFactory;

import com.crowgzy.javadesign.AbstractFactoryCode.factory.Link;

/**
 * @className: ListLink
 * @author: crowgzy
 * @date: 2022/11/20
 * @apiNote 表示具体零件
 **/
public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
