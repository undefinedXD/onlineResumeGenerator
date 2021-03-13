package com.liucw.resumeGenerator;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan(basePackages="com.liucw.resumeGenrator.dao")
public class ResumeGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResumeGeneratorApplication.class, args);
	}

}
