package com.crowgzy.javadesign.IteratorCode.domain;

/**
 * @className: Book
 * @apiNote 作为例子的集合元素
 * @author: crowgzy
 * @date: 2022/11/10
 **/
public class Book {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
