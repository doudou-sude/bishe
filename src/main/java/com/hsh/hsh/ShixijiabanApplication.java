package com.hsh.hsh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hsh.hsh.mapper")
public class ShixijiabanApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShixijiabanApplication.class, args);
    }

}
