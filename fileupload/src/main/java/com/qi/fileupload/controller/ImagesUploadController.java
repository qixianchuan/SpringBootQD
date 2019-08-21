package com.qi.fileupload.controller;

import com.qi.fileupload.service.impl.UploadServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-21 17:34
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@Controller
public class ImagesUploadController {

    @Autowired
    private UploadServiceImpl uploadServiceImpl;

    @GetMapping("/imagesUploadPage")
    public String imagesUploadPage() {
        return "imagesUploadPage";
    }

    /**
     * 图片上传
     *
     * @param file
     * @return
     */
    @RequestMapping(value = "uploadimage", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> uploadImage(@RequestParam("file") MultipartFile file) {
        String url = this.uploadServiceImpl.upload(file);
        if (StringUtils.isBlank(url)) {
            //url为空，证明上传失败
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.ok(url);
    }

}
