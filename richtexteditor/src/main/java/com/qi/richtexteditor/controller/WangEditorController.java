package com.qi.richtexteditor.controller;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.io.FileUtil;
import com.qi.richtexteditor.common.result.FileUploadErrorInfoEnum;
import com.qi.richtexteditor.common.result.GlobalErrorInfoException;
import com.qi.richtexteditor.common.result.UploadResultBody;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-20 10:43
 * @description：WangEditorController <br/>
 * github: https://github.com/wangfupeng1988/wangEditor/
 * 用户手册：https://www.kancloud.cn/wangfupeng/wangeditor3
 * @modified By：
 * @version: $version$
 */
@Controller
public class WangEditorController {

    @Value("${web.upload.path}")
    private String UPLOADED_FOLDER;

    @GetMapping("/")
    public String index() {
        return "wangEditor";
    }

    @GetMapping("/getContent")
    public String getContent() {
        return "getContent";
    }

    /**
     * 上传文件到服务器
     **/
    @GetMapping("/uploadPicturesToServer")
    public String uploadPicturesToServer() {
        return "uploadPicturesToServer";
    }

    @PostMapping("/upload")
    @ResponseBody
    public UploadResultBody upload(@RequestParam("photo") List<MultipartFile> list) throws GlobalErrorInfoException {
        Integer errno = 0;
        List<String> urls = new ArrayList<>();
        UploadResultBody uploadResultBody = new UploadResultBody();
        if (list.isEmpty()) {
            errno = 1;
            throw new GlobalErrorInfoException(FileUploadErrorInfoEnum.PARAMS_NO_COMPLETE);
        }
        for (MultipartFile file : list) {
            try {
                String now = DateUtil.format(new Date(), "yyyyMMddHHmmss");
                //为防止图片名称一样产生的覆盖问题,对图片重新命名
                boolean exist = FileUtil.exist(UPLOADED_FOLDER);
                if (!exist) {
                    FileUtil.mkdir(UPLOADED_FOLDER);
                }
                String newFileName = now + file.getOriginalFilename();
                File targetFile = new File(UPLOADED_FOLDER, newFileName);
                BufferedOutputStream out1 = new BufferedOutputStream(new FileOutputStream(targetFile));
                out1.write(file.getBytes());
                out1.flush();
                out1.close();
                if (targetFile.exists()) {
                    System.out.println("文件已经存在");
                }
                String url = newFileName;
                urls.add(url);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        uploadResultBody.setErrno(errno);
        uploadResultBody.setData(urls);
        return uploadResultBody;
    }
}

//    /**
//     * 富文本编辑器中上传图片功能
//     * @param list
//     * @return
//     */
//    @PostMapping(value = "/editor/upload")
//    public Map<String, Object> upload(@RequestParam("file") List<MultipartFile> list) {
//
//        Integer errno = 0;
//        List<String> urls = new ArrayList<>();
//        Map<String, Object> map = new HashMap<>(2);
//
//        if (list.size() == 0) {
//            errno = 1;
//        }
//
//        for (MultipartFile file : list) {
//            // 此处调用自己的上传文件方法
//            String url = fileService.putObjectToOss(file);
//            if(Strings.notEmpty(url)) {
//                logger.debug("富文本编辑器上传图片成功，文件名：{}，url：{}", file.getOriginalFilename(), url);
//                urls.add(url);
//            } else {
//                logger.debug("富文本编辑器上传图片失败，文件名：{}", file.getOriginalFilename());
//                errno = 2;
//            }
//        }
//
//        map.put("errno", errno);
//        map.put("data", urls);
//        return map;
//    }
