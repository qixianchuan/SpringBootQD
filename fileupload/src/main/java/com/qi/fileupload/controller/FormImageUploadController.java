package com.qi.fileupload.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-26 13:07
 * @description：FormImageUploadController
 * 参考文档：
 * https://my.oschina.net/sprouting/blog/1359279
 * @modified By：
 * @version: $version$
 */
@Controller
public class FormImageUploadController {
    @GetMapping("/formimage")
    public String index() {
        return "formimage";
    }

    @RequestMapping(value = "formimageUpload", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> register(HttpServletResponse response, HttpServletRequest request, ModelMap modelMap, @RequestParam(value = "wizard-picture", required = false) MultipartFile file) {
        String returnStr = "获取form和上传文件：\t";
        System.out.println(file.getOriginalFilename());
        returnStr += "文件名称：" + file.getOriginalFilename();
        String username = request.getParameter("username");
        returnStr += "\t 用户名:" + username;
        System.out.println(username);
        String password = request.getParameter("password");
        returnStr += "\t 密码：" + password;
        System.out.println(password);
        return ResponseEntity.ok(returnStr);
    }
}
