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

import java.util.List;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-14 17:44
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@RestController
@RequestMapping(value = "/user")
@Api(tags = "user manager", description = "user manager", value = "user manager")
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public ApiResponse addUser(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "job", required = false) String job) {
        User user = new User();
        user.setName(name);
        user.setJob(job);
        ApiResponse apiResponse = userService.insertUser(user);
        return apiResponse;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ApiResponse<List<User>> listUser() {
        return userService.findAllUser();
    }

    @RequestMapping(value = "/deleteUser", method = RequestMethod.POST)
    public ApiResponse deleteUserById(@RequestParam(value = "id", required = true) Integer id) {
        return userService.deleteUser(id);
    }

    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    public ApiResponse updateUser(@RequestParam(value = "id", required = true) Integer id, @RequestParam(value = "name", required = false) String name, @RequestParam(value = "job", required = false) String job) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setJob(job);
        ApiResponse apiResponse = userService.updateUser(user);
        return apiResponse;
    }
}
