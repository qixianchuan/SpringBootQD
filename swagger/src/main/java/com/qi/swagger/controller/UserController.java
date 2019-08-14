package com.qi.swagger.controller;

import com.qi.swagger.common.ApiResponse;
import com.qi.swagger.entity.User;
import com.qi.swagger.service.UserService;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-14 17:44
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@RestController
@RequestMapping(value = "/user")
@Api(tags = "1.0.0-SNAPSHOT", description = "user manager", value = "user manager")
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public ApiResponse<User> addUser(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "name", required = false) String job) {
        User user = new User();
        user.setId(1);
        user.setName(name);
        user.setJob(job);
        ApiResponse<User> userApiResponse = userService.insertUser(user);
        return userApiResponse;
    }

}
