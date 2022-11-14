package com.crowgzy.javadesign.SingletonCode.Practise;

/**
 * @className: Triple
 * @author: crowgzy
 * @date: 2022/11/14
 **/
public class Triple {

    private static Triple[] triples = new Triple[3];

    public static Triple getInstance(int id){
            return triples[id];
    }

}
