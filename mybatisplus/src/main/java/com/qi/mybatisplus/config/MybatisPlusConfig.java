package com.qi.mybatisplus.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-16 9:32
 * @description：MybatisPlus Configuration
 * @modified By：
 * @version: $version$
 */
@Configuration
@MapperScan(basePackages = {"com.qi.mybatisplus.mapper"})
@EnableTransactionManagement
public class MybatisPlusConfig {
    /**
     * 性能分析拦截器，不建议生产使用
     */
    @Bean
    public PerformanceInterceptor performanceInterceptor() {
        return new PerformanceInterceptor();
    }

    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        //你的最大单页限制数量，默认 500 条，小于 0 如 -1 不受限制
        paginationInterceptor.setLimit(-1);
        return paginationInterceptor;
    }
}
