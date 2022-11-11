package com.crowgzy.javadesign.AdapterCode.Reality;

/**
 * @className: Banner
 * @author: crowgzy
 * @date: 2022/11/11
 * @apiNote 实际情况
 **/
public class Banner {

    //起始电压
    private Integer electricNum;

    public Banner() {
        this.electricNum = 120;
    }

    public void changeStrong(){
        System.out.println(electricNum+"v"+"\t"+ "to" +"\t"+"220v");
    }

    public void  changeWeak(){
        System.out.println(electricNum+ "v"+"\t"+ "to" +"\t"+"12v");
    }
}
