package com.lyn.nianaicodemother;

import lombok.Getter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)
@MapperScan("com.lyn.nianaicodemother.mapper")
public class NianAiCodeMotherApplication {

    public static void main(String[] args) {
        SpringApplication.run(NianAiCodeMotherApplication.class, args);
    }


}
