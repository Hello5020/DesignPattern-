package com.crowgzy.javadesign.IteratorCode.Basic;

/**
 * @className: Aggregate
 * @apiNote 迭代器
 * @author: crowgzy
 * @date: 2022/11/10
 **/
public interface Iterator {
    /**
     * 判断集合中是否还具有下一个元素
     * @return
     */
    public abstract boolean hasNext();

    /**
     * 用于获取下一个元素
     * @return
     */
    public abstract Object next();
}
