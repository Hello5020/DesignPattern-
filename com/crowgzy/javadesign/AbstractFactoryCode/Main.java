package com.crowgzy.javadesign.AbstractFactoryCode;

import com.crowgzy.javadesign.AbstractFactoryCode.factory.Factory;
import com.crowgzy.javadesign.AbstractFactoryCode.factory.Link;
import com.crowgzy.javadesign.AbstractFactoryCode.factory.Page;
import com.crowgzy.javadesign.AbstractFactoryCode.factory.Tray;

/**
 * @className: Main
 * @author: crowgzy
 * @date: 2022/11/20
 **/
public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main listfactory.ListFactory");
            System.out.println("Example 2: java Main tablefactory.TableFactory");
            System.exit(0);
        }
        Factory factory = Factory.getFactory(args[0]);
        Link people = factory.createLink("人民日报", "http://www.people.com.cn");
        Link gmw = factory.createLink("光明日报", "http://www.gmw.cn/");

        Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
        Link jp_yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp/");

        Link excite = factory.createLink("Excite", "http://www.excite.com/");
        Link google = factory.createLink("Google", "http://www.google.com/");

        Tray trayNews = factory.createTray("日报");
        trayNews.add(people);
        trayNews.add(gmw);

        Tray trayYahoo = factory.createTray("Yahoo!");
        trayYahoo.add(us_yahoo);
        trayYahoo.add(jp_yahoo);

        Tray traySearch = factory.createTray("搜索引擎");
        traySearch.add(trayYahoo);
        traySearch.add(excite);
        traySearch.add(google);

        Page page = factory.createPage("LinkPage", "mingchenxu");
        page.add(trayNews);
        page.add(traySearch);

        page.output();
    }
}
