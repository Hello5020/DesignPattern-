package com.crowgzy.javadesign.SingletonCode;

import com.crowgzy.javadesign.SingletonCode.Practise.TicketMaker;

/**
 * @className: Main
 * @author: crowgzy
 * @date: 2022/11/14
 * @apiNote 单例模式
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        HungrySingleton obj1 = HungrySingleton.getInstance();
        HungrySingleton obj2 = HungrySingleton.getInstance();
        if(obj1 == obj2){
            System.out.println("obj1与obj2调用的是一个对象!");
        }else{
            System.out.println("obj1与obj2调用的不是一个对象!");
        }
        System.out.println("End.");

        TicketMaker ticketMaker = TicketMaker.getInstance();
        ticketMaker.getTicket();
    }
}
