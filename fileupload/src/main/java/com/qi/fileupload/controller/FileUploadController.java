package com.qi.fileupload.controller;

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

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-19 10:43
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@Controller
public class FileUploadController {

    private static String UPLOADED_FOLDER = "E://temp//";

    @GetMapping("/")
    public String index() {
        return "upload";
    }

    @GetMapping("/ajax")
    public String ajaxupload() {
        return "test";//return "gf"
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

    @PostMapping("/ajaxupload")
    public @ResponseBody String ajaxFileUpload(@RequestParam("imgFile") MultipartFile imgFile) {
        String returnStr = "";
        if (imgFile.isEmpty()) {
            returnStr = "您没有上传文件！";
        }
        try {
            byte[] bytes = imgFile.getBytes();
            Path path = Paths.get(UPLOADED_FOLDER + imgFile.getOriginalFilename());
            Files.write(path, bytes);
            returnStr = "上传成功";
        } catch (IOException e) {
            e.printStackTrace();
        }
        return returnStr;
//        return "gf";
    }


    public String upload(@RequestParam("imgFile") MultipartFile imgFile) throws Exception{
        byte[] bytes = imgFile.getBytes();

        return "";
    }

    @GetMapping("/uploadStatus")
    public String uploadStatus() {
        return "uploadStatus";
    }

}
