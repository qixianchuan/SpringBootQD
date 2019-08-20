package com.qi.richtexteditor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-20 15:14
 * @description：参考
 * github: https://github.com/quilljs/quill
 * https://www.jianshu.com/p/b237372f15cc
 * @modified By：
 * @version: $version$
 */
@Controller
public class QuillController {

    @GetMapping("/helloquill")
    public String helloquill() {
        return "helloquill";
    }

    @GetMapping("/quillformat")
    public String quillformat() {
        return "quillformat";
    }

    @GetMapping("/quillhtml")
    public String quillhtml() {
        return "quillhtml";
    }

}
