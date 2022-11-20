package com.crowgzy.javadesign.AbstractFactoryCode.listFactory;

import com.crowgzy.javadesign.AbstractFactoryCode.factory.Factory;
import com.crowgzy.javadesign.AbstractFactoryCode.factory.Link;
import com.crowgzy.javadesign.AbstractFactoryCode.factory.Page;
import com.crowgzy.javadesign.AbstractFactoryCode.factory.Tray;

/**
 * @className: ListFactory
 * @author: crowgzy
 * @date: 2022/11/20
 * @apiNote 表示具体工厂
 **/
public class ListFactory extends Factory {
        @Override
        public Link createLink(String caption, String url) {
            return new ListLink(caption, url);
        }

        @Override
        public Tray createTray(String caption) {
            return new ListTray(caption);
        }

        @Override
        public Page createPage(String title, String author) {
            return new ListPage(title, author);
        }
}
