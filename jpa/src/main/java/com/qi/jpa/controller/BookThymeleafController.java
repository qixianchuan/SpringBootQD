package com.qi.jpa.controller;

import com.qi.jpa.entity.Book;
import com.qi.jpa.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-23 9:13
 * @description：BookThymeleafController
 * @modified By：
 * @version: $version$
 */
@Controller
public class BookThymeleafController {

    @Autowired
    private BookService bookService;

    /**thymeleaf**/
    @RequestMapping("/bookThymeleaf")
    public String bookThymeleaf() {
        return "redirect:/list";
    }

    @RequestMapping("/list")
    public String list(Model model) {
        List<Book> bookList = bookService.findAll();
        model.addAttribute("books", bookList);
        return "book/list";
    }

    @RequestMapping("/toAdd")
    public String toAdd() {
        return "book/bookAdd";
    }

    @RequestMapping("/add")
    public String add(Book book) {
        bookService.insertByBook(book);
        return "redirect:/list";
    }

    @RequestMapping("/toEdit")
    public String toEdit(Model model,Long id) {
        Book book = bookService.findById(id);
        model.addAttribute("book", book);
        return "book/bookEdit";
    }

    @RequestMapping("/edit")
    public String edit(Book book) {
        bookService.update(book);
        return "redirect:/list";
    }


    @RequestMapping("/delete")
    public String delete(Long id) {
        bookService.delete(id);
        return "redirect:/list";
    }

}
