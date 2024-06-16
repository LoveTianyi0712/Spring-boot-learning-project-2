package com.jxglyf.mpdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jxglyf.mpdemo.mapper")
public class MpDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MpDemoApplication.class, args);
    }

}
