package com.qi.richtexteditor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-20 15:14
 * @description：参考
 * https://github.com/quilljs/quill
 * @modified By：
 * @version: $version$
 */
@Controller
public class QuillController {

    @GetMapping("/quill")
    public String index() {
        return "helloquill";
    }



}
