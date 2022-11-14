package com.crowgzy.javadesign.SingletonCode.Practise;

/**
 * @className: TicketMaker
 * @author: crowgzy
 * @date: 2022/11/14
 **/
public class TicketMaker {
    private static TicketMaker ticketMaker = new TicketMaker();
    private int ticket = 1000;

//    synchronized关键字最主要有以下3种应用方式，下面分别介绍
//
//    修饰实例方法，作用于当前实例加锁，进入同步代码前要获得当前实例的锁
//    修饰静态方法，作用于当前类对象加锁，进入同步代码前要获得当前类对象的锁
//    修饰代码块，指定加锁对象，对给定对象加锁，进入同步代码块前要获得给定对象的锁



    public  synchronized int getTicketNum() {
        return ticket++;
    }

    public static TicketMaker getInstance(){
        return ticketMaker;
    }
}
