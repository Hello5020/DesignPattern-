package com.crowgzy.javadesign.BuilderCode;

import com.crowgzy.javadesign.BuilderCode.Basic.BuilderInterface;

/**
 * @className: Director
 * @author: crowgzy
 * @date: 2022/11/18
 **/
public class DirectorByInterface {

    private BuilderInterface builder;

    public DirectorByInterface(BuilderInterface builder) {
        this.builder = builder;
    }
    public void construct(){
        builder.makeTitle("Greeting");
        builder.makeString("从早上到下午");
        builder.makeItem(new String[]{
                "早上好.",
                "下午好.",
        });
        builder.makeString("晚上");
        builder.makeItem(new String[]{
                "晚上好.",
                "晚安.",
                "再见."
        });
        builder.close();
    }

}
