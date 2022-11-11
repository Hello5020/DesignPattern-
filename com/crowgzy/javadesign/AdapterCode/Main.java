package com.crowgzy.javadesign.AdapterCode;

import com.crowgzy.javadesign.AdapterCode.Requirement.Print;
import com.crowgzy.javadesign.AdapterCode.Wrapper.PrintBannerByExtends;
import com.crowgzy.javadesign.AdapterCode.Wrapper.PrintBannerByHas;

/**
 * @className: Main
 * @author: crowgzy
 * @date: 2022/11/11
 * @apiNote 适配器模式(以电压降压压与升压形式来模拟)
 **/
public class Main {

    public static void main(String[] args) {
        System.out.println("--------------类适配器-------------");
        Print byExtends = new PrintBannerByExtends();
        byExtends.strengthen();
        byExtends.weaken();
        System.out.println("--------------对象适配器-------------");
        Print byHas = new PrintBannerByHas();
        byHas.strengthen();
        byHas.weaken();
    }
}
