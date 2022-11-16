package com.crowgzy.javadesign.PrototypeCode;

import com.crowgzy.javadesign.PrototypeCode.framework.Manager;
import com.crowgzy.javadesign.PrototypeCode.framework.Product;

/**
 * @className: Main
 * @author: crowgzy
 * @date: 2022/11/16
 * @apiNote Prototype模式,通过实例来生成实例的模式,通过复用生成实例
 **/
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen underlinePen = new UnderlinePen('~');
        MessageBox messageBox = new MessageBox('*');
        MessageBox messageBox1 = new MessageBox('/');
        manager.register("underlinePen",underlinePen);
        manager.register("msg1",messageBox);
        manager.register("msg2",messageBox1);
        Product p1 = manager.create("underlinePen");
        p1.use("Hello");
        Product p2 = manager.create("msg1");
        p2.use("Hello");
        Product p3 = manager.create("msg2");
        p3.use("Hello");
    }
}
