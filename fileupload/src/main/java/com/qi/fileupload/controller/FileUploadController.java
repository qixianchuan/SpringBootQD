package com.qi.fileupload.controller;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.io.FileUtil;
import com.qi.fileupload.common.result.GlobalErrorInfoException;
import com.qi.fileupload.common.result.ResultBody;
import com.qi.fileupload.common.result.FileUploadErrorInfoEnum;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-19 10:43
 * @description：FileUploadController
 * @modified By：
 * @version: $version$
 */
@Controller
public class FileUploadController {

    private static String UPLOADED_FOLDER = "E://temp//";

    /**第一种：springmvc上传**/

    @GetMapping("/")
    public String index() {
        return "upload";
    }

    @PostMapping("/upload")
    public String singleFileUpload(@RequestParam("file") MultipartFile file,
                                   RedirectAttributes redirectAttributes) {
        if (file.isEmpty()) {
            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
            return "redirect:uploadStatus";
        }

        try {
            // Get the file and save it somewhere
            byte[] bytes = file.getBytes();
            Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
            Files.write(path, bytes);
            redirectAttributes.addFlashAttribute("message",
                    "You successfully uploaded '" + file.getOriginalFilename() + "'");

        } catch (IOException e) {
            e.printStackTrace();
        }

        return "redirect:/uploadStatus";
    }

    @GetMapping("/uploadStatus")
    public String uploadStatus() {
        return "uploadStatus";
    }

    /**第二种 ajax上传 利用jquery.fileupload 插件**/

    @GetMapping("/ajax")
    public String ajaxupload() {
        return "ajaxupload";
    }

    @PostMapping("/ajaxupload")
    @ResponseBody
    public ResultBody upload(@RequestParam("imgFile") MultipartFile imgFile)  throws GlobalErrorInfoException {
        //TODO LIST
        /**
         * 1.文件大小超出，等 Exception
         * 2.js 文件类型判断（2种），以及大小判断
         * **/
//        String returnStr = "";
        ResultBody resultBody = null;
        if (imgFile.isEmpty()) {
//            returnStr = "您没有上传文件！";
            throw new GlobalErrorInfoException(FileUploadErrorInfoEnum.PARAMS_NO_COMPLETE);
        }
        try {
            byte[] bytes = imgFile.getBytes();
            String now = DateUtil.format(new Date(), "yyyyMMddHHmmss");
            //为防止图片名称一样产生的覆盖问题,对图片重新命名
            Path path = Paths.get(UPLOADED_FOLDER + now + imgFile.getOriginalFilename());
            boolean exist = FileUtil.exist(UPLOADED_FOLDER);
            if(!exist){
                FileUtil.mkdir(UPLOADED_FOLDER);
            }
            Files.write(path, bytes);
//            returnStr = "上传成功";
            resultBody = new ResultBody("上传成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultBody;
    }
}
