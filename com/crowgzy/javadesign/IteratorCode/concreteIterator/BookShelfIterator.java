package com.crowgzy.javadesign.IteratorCode.concreteIterator;

import com.crowgzy.javadesign.IteratorCode.Basic.Iterator;
import com.crowgzy.javadesign.IteratorCode.concreteAggregate.BookShelf;
import com.crowgzy.javadesign.IteratorCode.concreteAggregate.BookShelfByArrayList;
import com.crowgzy.javadesign.IteratorCode.domain.Book;

/**
 * @className: BookShelfIterator
 * @author: crowgzy
 * @date: 2022/11/10
 **/
public class BookShelfIterator implements Iterator {

    private BookShelf bookShelf;
    private BookShelfByArrayList bookShelfByArrayList;

    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }


    public BookShelfIterator(BookShelfByArrayList bookShelfByArrayList) {
        this.bookShelfByArrayList = bookShelfByArrayList;
    }

    @Override
    public boolean hasNext() {
        if (bookShelf != null){
            return this.index < bookShelf.getLength();
        }else {
            return  this.index < bookShelfByArrayList.getLength();
        }

    }

    @Override
    public Book next() {
        if (bookShelf != null){
             return bookShelf.getBookByIndex(index++);
        }else {
            return bookShelfByArrayList.getBookByIndex(index++);
        }

    }
}
