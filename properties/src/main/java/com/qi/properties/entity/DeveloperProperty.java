package com.qi.properties.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-26 15:15
 * @description：DeveloperProperty
 * @modified By：
 * @version: $version$
 */
@Data
@ConfigurationProperties(prefix = "developer")
@Component
public class DeveloperProperty {
    private String name;
    private String website;
    private String qq;
    private String phoneNumber;
}
