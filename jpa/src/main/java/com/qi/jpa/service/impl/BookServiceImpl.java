package com.qi.jpa.service.impl;

import com.qi.jpa.dao.BookDao;
import com.qi.jpa.entity.Book;
import com.qi.jpa.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-14 14:03
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public List<Book> findAll() {
        return bookDao.findAll();
    }

    @Override
    public Book insertByBook(Book book) {
        return bookDao.save(book);
    }

    @Override
    public Book update(Book book) {
        return bookDao.save(book);
    }

    @Override
    public Book delete(Long id) {
        Book book = bookDao.findById(id).get();
        bookDao.delete(book);
        return book;
    }

    @Override
    public Book findById(Long id) {
        return bookDao.findById(id).get();
    }
}
