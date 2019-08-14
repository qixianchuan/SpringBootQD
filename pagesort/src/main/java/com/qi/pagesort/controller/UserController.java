package com.qi.pagesort.controller;

import com.qi.pagesort.entity.User;
import com.qi.pagesort.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-14 16:05
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public Page<User> getUserPage(Pageable pageable) {
        return userService.findByPage(pageable);
    }
}
