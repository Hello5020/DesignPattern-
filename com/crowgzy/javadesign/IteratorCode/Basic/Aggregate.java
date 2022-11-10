package com.crowgzy.javadesign.IteratorCode.Basic;

/**
 * @className: Aggregate
 * @apiNote 集合
 * @author: crowgzy
 * @date: 2022/11/10
 **/
public interface Aggregate {
    /**
     * 用于生成遍历集合的迭代器
     * @return
     */
    public abstract Iterator iterator();
}
