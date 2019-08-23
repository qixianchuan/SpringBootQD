package com.qi.jpa.service;

import com.qi.jpa.entity.Book;

import java.util.List;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-14 14:01
 * @description：BookService
 * @modified By：
 * @version: $version$
 */
public interface BookService {

    List<Book> findAll();

    Book insertByBook(Book book);

    Book update(Book book);

    Book delete(Long id);

    Book findById(Long id);

}
