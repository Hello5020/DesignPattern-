package com.crowgzy.javadesign.IteratorCode.concreteAggregate;

import com.crowgzy.javadesign.IteratorCode.Basic.Aggregate;
import com.crowgzy.javadesign.IteratorCode.Basic.Iterator;
import com.crowgzy.javadesign.IteratorCode.concreteIterator.BookShelfIterator;
import com.crowgzy.javadesign.IteratorCode.domain.Book;

import java.util.ArrayList;

/**
 * @className: BookShelfByArrayList
 * @author: crowgzy
 * @date: 2022/11/10
 **/
public class BookShelfByArrayList implements Aggregate {
    private ArrayList<Book> books;

    public BookShelfByArrayList () {
        this.books = new ArrayList<>();
    }

    public Book getBookByIndex(int index){
        return this.books.get(index);
    }

    public void appendBook(Book book){
        books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }

}
