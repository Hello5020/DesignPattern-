package com.crowgzy.javadesign.PrototypeCode.framework;

import java.util.HashMap;

/**
 * @className: Manager
 * @author: crowgzy
 * @date: 2022/11/16
 **/
public class Manager {
    /**
     * 用于表示名字与实例之间的对应关系
     */
    private HashMap<String,Product> showCase = new HashMap<>();

    public void register(String name,Product product){
        showCase.put(name,product);
    }

    public Product create(String productName){
        Product p =  showCase.get(productName);
        return p.createClone();
    }
}
