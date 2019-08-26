package com.qi.properties.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-26 15:16
 * @description：项目配置
 * @modified By：
 * @version: $version$
 */
@Data
@Component
public class ApplicationProperty {
    @Value("${application.name}")
    private String name;
    @Value("${application.version}")
    private String version;
}
