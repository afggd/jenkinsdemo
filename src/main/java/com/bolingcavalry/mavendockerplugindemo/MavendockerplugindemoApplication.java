package com.bolingcavalry.mavendockerplugindemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bolingcavalry.mavendockerplugindemo.dao")
public class MavendockerplugindemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavendockerplugindemoApplication.class, args);
	}
}
