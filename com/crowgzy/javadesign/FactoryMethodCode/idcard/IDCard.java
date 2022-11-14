package com.crowgzy.javadesign.FactoryMethodCode.idcard;

import com.crowgzy.javadesign.FactoryMethodCode.framework.Product;

/**
 * @className: IDCard
 * @author: crowgzy
 * @date: 2022/11/13
 * @apiNote feamework包可视为生成实例的框架;
 **/
public class IDCard extends Product {
    private String owner;
    private int id;
//    如果构造函数的可见性为public，那么外部类可直接使用构造函数来创建实例，而这是设计者所不希望的。
//    使用构造函数的可见性为package，可以限制外部类只能通过工厂来创建实例。
    IDCard(String owner,int id) {
        System.out.println("制作"+owner+"的ID卡"+id);
        this.owner = owner;
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public void use() {
        System.out.println("使用"+owner+"的ID卡"+id);
    }
}
