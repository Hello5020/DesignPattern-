package com.crowgzy.javadesign.PrototypeCode.framework;

/**
 * @className: BasicProduct
 * @author: crowgzy
 * @date: 2022/11/16
 **/
public class BasicProduct implements Product{
    @Override
    public void use(String s) {

    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
