package com.study.gulimall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 1. 整合MyBatis-Plus
 *      1)、倒入依赖
 *      <dependency>
 *           <groupId>com.baomidou</groupId>
 *           <artifactId>mybatis-plus-boot-starter</artifactId>
 *           <version>3.4.3.4</version>
 *      </dependency>
 *      2)、配置
 *          1、配置数据源
 *              1）、导入数据库的驱动
 *              2）、在application.yml配置数据源相关信息
 *          2、配置MyBatis-plus:
 *              1)、使用@MapperScan
 *              2)、告诉Mybatis-plus Mapper在哪里
 */

@MapperScan("com.study.gulimall.order.dao")
@SpringBootApplication
public class GulimallOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallOrderApplication.class, args);
    }
}
