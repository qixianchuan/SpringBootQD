### some spring-boot demo
- spring-boot version 2.1.7.RELEASE
#### war
- 把项目打成war包
- 更改spring-boot控制台默认启动图标，在resources中放入banner.txt文件

#### mybatis

#### mybatispagehelper

#### mybatisplus

#### jpa

#### scheduler

#### druid

#### swagger

#### mongodb

#### redis

#### unit test

#### file upload

```java
//Tomcat large file upload connection reset
    @Bean
    public TomcatEmbeddedServletContainerFactory tomcatEmbedded() {
        TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory();
        tomcat.addConnectorCustomizers((TomcatConnectorCustomizer) connector -> {
            if ((connector.getProtocolHandler() instanceof AbstractHttp11Protocol<?>)) {
                //-1 means unlimited
                ((AbstractHttp11Protocol<?>) connector.getProtocolHandler()).setMaxSwallowSize(-1);
            }
        });
        return tomcat;
    }

```

-  https://www.jianshu.com/p/3efa9225d012 这篇文章解决上面的那块代码是干啥的