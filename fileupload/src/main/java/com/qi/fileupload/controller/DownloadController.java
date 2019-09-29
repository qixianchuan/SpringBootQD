package com.qi.fileupload.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-09-29 10:23
 * @description：download
 * @modified By：
 * @version: 1.0$
 */
@Controller
public class DownloadController {

    @GetMapping("/download")
    public String download() {
        return "download";
    }

    /**
     * 下载文件
     * 源文件 G:\MybatisCodeHelper.txt
     * 下载文件 a.txt
     **/
    @RequestMapping("/testResponseEntity")
    public ResponseEntity<byte[]> testResponseEntity() throws IOException {
        FileInputStream input = new FileInputStream(new File("G:\\MybatisCodeHelper.txt"));
        byte[] body = new byte[input.available()];
        input.read(body);
        input.close();

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "attachment;filename=a.txt");
        HttpStatus statusCode = HttpStatus.OK;

        ResponseEntity<byte[]> entity = new ResponseEntity<byte[]>(body, headers, statusCode);
        return entity;
    }
}
