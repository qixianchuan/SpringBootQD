package com.qi.fileupload.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-21 17:35
 * @description：UploadService
 * @modified By：
 * @version: $version$
 */
public interface UploadService {
    /**
     * 文件上传
     * @param file
     * @return
     */
    String upload(MultipartFile file);
}
