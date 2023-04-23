package com.icss;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//扫描dao接口，并给dao接口创建对象
@MapperScan("com.icss.dao")
public class SpringBootTest {

    public static void main(String[] args) {
        System.out.println("xxxxx");
        SpringApplication.run(SpringBootTest.class,args);
    }
}
