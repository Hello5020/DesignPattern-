package com.crowgzy.javadesign.IteratorCode.concreteAggregate;

import com.crowgzy.javadesign.IteratorCode.Basic.Aggregate;
import com.crowgzy.javadesign.IteratorCode.Basic.Iterator;
import com.crowgzy.javadesign.IteratorCode.concreteIterator.BookShelfIterator;
import com.crowgzy.javadesign.IteratorCode.domain.Book;

/**
 * @className: BookShelf
 * @apiNote 具体的集合
 * @author: crowgzy
 * @date: 2022/11/10
 **/
public class BookShelf implements Aggregate {

    private Book[] books;

    /**
     * 用于表示集合长度
     */
    private int last = 0;

    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }

    public Book getBookByIndex(int index){
        return this.books[index];
    }

    public void appendBook(Book book){
            this.books[this.last] = book;
            last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }


}