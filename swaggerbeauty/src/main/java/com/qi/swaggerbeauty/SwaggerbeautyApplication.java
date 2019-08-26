package com.qi.swaggerbeauty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * github地址：
 * https://github.com/battcn/swagger-spring-boot
 * swagger-spring-boot-starter 是一款建立在swagger基础之上的工具包，
 * 利用SpringBoot自动装配的特性，简化了传统swagger的繁琐配置
 *
 * ## 参考

 - https://github.com/battcn/swagger-spring-boot/blob/master/README.md
 - 几款比较好看的swagger-ui，具体使用方法参见各个依赖的官方文档：
 - [battcn](https://github.com/battcn) 的  [swagger-spring-boot-starter](https://github.com/battcn/swagger-spring-boot) 文档：https://github.com/battcn/swagger-spring-boot/blob/master/README.md
 - [ swagger-ui-layer](https://gitee.com/caspar-chen/Swagger-UI-layer) 文档：https://gitee.com/caspar-chen/Swagger-UI-layer#%E5%A6%82%E4%BD%95%E4%BD%BF%E7%94%A8
 - [swagger-bootstrap-ui](https://gitee.com/xiaoym/swagger-bootstrap-ui) 文档：https://gitee.com/xiaoym/swagger-bootstrap-ui#%E4%BD%BF%E7%94%A8%E8%AF%B4%E6%98%8E
 - [swagger-ui-themes](https://github.com/ostranme/swagger-ui-themes) 文档：https://github.com/ostranme/swagger-ui-themes#getting-started
 * **/
@SpringBootApplication
public class SwaggerbeautyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerbeautyApplication.class, args);
	}

}
