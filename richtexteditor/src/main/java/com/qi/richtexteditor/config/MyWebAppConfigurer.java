package com.qi.richtexteditor.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-20 14:25
 * @description： 参考
 * https://blog.52itstyle.vip/archives/2552/
 * WebMvcConfigurerAdapter已过时
 * https://www.cnblogs.com/xingzc/p/8656088.html
 * @modified By：
 * @version: $version$
 */
@Configuration
public class MyWebAppConfigurer extends WebMvcConfigurationSupport {

    @Value("${web.upload.path}")
    private String uploadPath;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        super.addResourceHandlers(registry);
        registry.addResourceHandler("/**").addResourceLocations(
                "file:" + uploadPath);
//        LOGGER.info("自定义静态资源目录、此处功能用于文件映射");
    }
}
