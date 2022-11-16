package com.crowgzy.javadesign.PrototypeCode;

import com.crowgzy.javadesign.PrototypeCode.framework.BasicProduct;
import com.crowgzy.javadesign.PrototypeCode.framework.Product;

/**
 * @className: MessageBox
 * @author: crowgzy
 * @date: 2022/11/16
 **/
public class MessageBox extends BasicProduct {

    private char deoChar;

    public MessageBox(char deoChar) {
        this.deoChar = deoChar;
    }

    @Override
    public void use(String s) {
        for (int i = 0; i < s.length() + 4; i++) {
            System.out.print(deoChar);
        }
        System.out.println("");
        System.out.println(deoChar + " " + s  + " " + deoChar);
        for (int i = 0; i < s.length() + 4; i++) {
            System.out.print(deoChar);
        }
        System.out.println("");
    }

    @Override
    public Product createClone() {
        return super.createClone();
    }
}
