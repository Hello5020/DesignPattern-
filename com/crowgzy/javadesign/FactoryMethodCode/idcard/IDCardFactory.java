package com.crowgzy.javadesign.FactoryMethodCode.idcard;

import com.crowgzy.javadesign.FactoryMethodCode.framework.Factory;
import com.crowgzy.javadesign.FactoryMethodCode.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @className: IDCardFactory
 * @author: crowgzy
 * @date: 2022/11/13
 **/
public class IDCardFactory extends Factory {
    private List<String> owners = new ArrayList<>();
    private int idNum=0;

    @Override
    protected  Product createProduct(String owner) {
        return new IDCard(owner,idNum++);
    }

    public List<String> getOwners() {
        return owners;
    }

    @Override
    protected  void registerProduct(Product product) {
        IDCard idCard = (IDCard) product;
        owners.add(idCard.getOwner());
    }
}
