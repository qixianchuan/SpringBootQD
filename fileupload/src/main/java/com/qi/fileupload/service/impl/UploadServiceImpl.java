package com.qi.fileupload.service.impl;

import com.github.tobato.fastdfs.domain.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import com.qi.fileupload.service.UploadService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.apache.commons.lang3.StringUtils;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-21 17:36
 * @description：UploadServiceImpl
 * @modified By：
 * @version: $version$
 */
@Service
public class UploadServiceImpl implements UploadService {

    @Autowired
    private FastFileStorageClient storageClient;

    private static final Logger logger= LoggerFactory.getLogger(UploadServiceImpl.class);
    /**
     *     支持上传的文件类型
     */
    private static final List<String> suffixes = Arrays.asList("image/png","image/jpeg","image/jpg");


    @Override
    public String upload(MultipartFile file) {
        /**
         * 1.图片信息校验
         *      1)校验文件类型
         *      2)校验图片内容
         * 2.保存图片
         *      1)生成保存目录
         *      2)保存图片
         *      3)拼接图片地址
         */
        try {
            String type = file.getContentType();
            if (!suffixes.contains(type)) {
                logger.info("上传文件失败，文件类型不匹配：{}", type);
                return null;
            }
            BufferedImage image = ImageIO.read(file.getInputStream());
            if (image == null) {
                logger.info("上传失败，文件内容不符合要求");
                return null;
            }

            File dir = new File("E:\\temp");
            if (!dir.exists()){
                dir.mkdirs();
            }
            file.transferTo(new File(dir, Objects.requireNonNull(file.getOriginalFilename())));

            String url = file.getOriginalFilename();//"http://image.leyou.com/upload/"+

//            StorePath storePath = this.storageClient.uploadFile(
//                    file.getInputStream(), file.getSize(), getExtension(file.getOriginalFilename()), null);
//
//            String url = "http://image.leyou.com/"+storePath.getFullPath();
//            System.out.println(url);
            return url;
        }catch (Exception e){
            return null;
        }
    }

    public String getExtension(String fileName){
        return StringUtils.substringAfterLast(fileName,".");
    }
}
