package com.qi.unittest.unittest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-14 13:09
 * @description：for unit test
 * @modified By：
 * @version: $version$
 */
@Controller
public class UnitTestController {

    @RequestMapping(value = "/unit",method = RequestMethod.GET)
    @ResponseBody
    public String toTest() {
        return "unit Test";
    }
}
