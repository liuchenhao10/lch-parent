package com.lch.commodityfirst;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author LiuChenHao
 * @version Test
 * @createDate 2021/4/23 22:31
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.lch"})
//@MapperScan("com.lch.mapper") //扫描包下的所有mapper文件
public class CommodityApplication {
    public static void main(String[] args) {
        SpringApplication.run(CommodityApplication.class,args);
    }
}
