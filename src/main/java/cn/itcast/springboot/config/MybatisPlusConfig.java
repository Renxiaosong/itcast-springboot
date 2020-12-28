package cn.itcast.springboot.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@MapperScan("cn.itcast.springboot.dao")//设置mapper接口的扫描包
public class MybatisPlusConfig {
    //配置分页插件的bean
//    @Bean
//    public PaginationInterceptor paginationInterceptor() {
//        return new PaginationInterceptor();
//    }
}