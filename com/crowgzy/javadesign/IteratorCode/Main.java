package com.crowgzy.javadesign.IteratorCode;

import com.crowgzy.javadesign.IteratorCode.Basic.Iterator;
import com.crowgzy.javadesign.IteratorCode.concreteAggregate.BookShelf;
import com.crowgzy.javadesign.IteratorCode.concreteAggregate.BookShelfByArrayList;
import com.crowgzy.javadesign.IteratorCode.domain.Book;

/**
 * @className: Main
 * @author: crowgzy
 * @date: 2022/11/10
 **/
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(5);
        bookShelf.appendBook(new Book("java"));
        bookShelf.appendBook(new Book("mysql"));
        bookShelf.appendBook(new Book("python"));
        bookShelf.appendBook(new Book("c++"));
        bookShelf.appendBook(new Book("c"));
        Iterator iterator = bookShelf.iterator();
        System.out.println("------------数组--------------");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        BookShelfByArrayList bookShelfByArrayList = new BookShelfByArrayList();
        bookShelfByArrayList.appendBook(new Book("java"));
        bookShelfByArrayList.appendBook(new Book("mysql"));
        bookShelfByArrayList.appendBook(new Book("python"));
        bookShelfByArrayList.appendBook(new Book("c++"));
        bookShelfByArrayList.appendBook(new Book("c"));
        Iterator iterator1 = bookShelfByArrayList.iterator();
        System.out.println("------------ArrayList--------------");
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
