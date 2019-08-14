package com.qi.jpa.controller;

import com.qi.jpa.entity.Book;
import com.qi.jpa.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-14 14:13
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@Controller
@RequestMapping(value = "/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public List<Book> getBookList() {
        List<Book> all = bookService.findAll();
        return all;
    }

//    @RequestMapping(value = "/addBook/{name}/{writer}/{introduction}", method = RequestMethod.POST)
//    @ResponseBody
//    public Book addBook(@PathVariable String name, @PathVariable String writer, @PathVariable String introduction) {
//        Book book = new Book();
//        book.setName(name);
//        book.setWriter(writer);
//        book.setIntroduction(introduction);
//        Book book1 = bookService.insertByBook(book);
//        return book1;
//    }

    @RequestMapping(value = "/addBook", method = RequestMethod.POST)
    @ResponseBody
    public Book addBook(@RequestParam(value = "name", required = true) String name, @RequestParam(value = "writer", required = true) String writer, @RequestParam(value = "introduction", required = true) String introduction) {
        Book book = new Book();
        book.setName(name);
        book.setWriter(writer);
        book.setIntroduction(introduction);
        Book book1 = bookService.insertByBook(book);
        return book1;
    }

    @RequestMapping(value = "/updateBook/{id}/{name}/{writer}/{introduction}", method = RequestMethod.POST)
    @ResponseBody
    public Book updateBook(@PathVariable Long id, @PathVariable String name, @PathVariable String writer, @PathVariable String introduction) {
        Book book = new Book();
        book.setId(id);
        book.setName(name);
        book.setWriter(writer);
        book.setIntroduction(introduction);
        Book book1 = bookService.update(book);
        return book1;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Book deleteBook(@PathVariable Long id) {
        Book book = bookService.delete(id);
        return book;
    }

    @RequestMapping(value = "/findBookById/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Book findBookById(@PathVariable Long id) {
        Book book = bookService.findById(id);
        return book;
    }
}
