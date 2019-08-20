### some spring-boot demo

#### mybatis

#### mybatispagehelper

#### mybatisplus

#### jpa

#### druid

#### swagger

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