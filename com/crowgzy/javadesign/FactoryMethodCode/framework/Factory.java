package com.crowgzy.javadesign.FactoryMethodCode.framework;

/**
 * @className: Factory
 * @author: crowgzy
 * @date: 2022/11/13
 * @apiNote 使用Template Method模式声明该类
 **/
public  abstract class Factory {
     public final Product create(String owner){
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }
    protected  abstract Product createProduct(String owner);
    protected  abstract void registerProduct(Product product);
}
