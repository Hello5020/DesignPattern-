package com.crowgzy.javadesign.PrototypeCode.framework;

/**
 * @className: Product
 * @author: crowgzy
 * @date: 2022/11/15
 * @apiNote 实现Cloneable接口的类可以通过clone方法来复制实例
 **/

public interface Product extends Cloneable{
    /**
     *用于"使用"的方法,具体怎么使用交给子类使用;
     * @param s
     */
    public abstract void use(String s);

    /**
     * 用于复制实例的方法
     * @return
     */
    public abstract Product createClone();
}

