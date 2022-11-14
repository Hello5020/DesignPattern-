package com.crowgzy.javadesign.FactoryMethodCode;

import com.crowgzy.javadesign.FactoryMethodCode.framework.Factory;
import com.crowgzy.javadesign.FactoryMethodCode.framework.Product;
import com.crowgzy.javadesign.FactoryMethodCode.idcard.IDCardFactory;

/**
 * @className: Main
 * @author: crowgzy
 * @date: 2022/11/13
 * @apiNote 工厂模式(以idCard制造过程)
 **/
public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("小明");
        Product card2 = factory.create("小红");
        Product card3 = factory.create("小刚");
        card1.use();
        card2.use();
        card3.use();
    }
}
