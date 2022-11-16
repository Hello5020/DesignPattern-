package com.crowgzy.javadesign.PrototypeCode;

import com.crowgzy.javadesign.PrototypeCode.framework.BasicProduct;
import com.crowgzy.javadesign.PrototypeCode.framework.Product;

/**
 * @className: UnderlinePen
 * @author: crowgzy
 * @date: 2022/11/16
 **/
public class UnderlinePen extends BasicProduct {

    private char ulChar;

    public UnderlinePen(char ulChar) {
        this.ulChar = ulChar;
    }

    @Override
    public void use(String s) {

        System.out.println( " \"" + s  + "\" " );
        for (int i = 0; i < s.length() + 4; i++) {
            System.out.print(ulChar);
        }
        System.out.println("");
    }

    @Override
    public Product createClone() {
       return super.createClone();
    }
}
