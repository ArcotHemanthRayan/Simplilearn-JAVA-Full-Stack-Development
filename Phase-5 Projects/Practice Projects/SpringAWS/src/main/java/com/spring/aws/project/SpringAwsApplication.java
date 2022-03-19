package com.spring.aws.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAwsApplication 
{
	@GetMapping("/aws")
	public String aws()
	{
		return "This is an AWS Development and project deployment in AWS";
	}

	public static void main(String[] args) 
	{
		SpringApplication.run(SpringAwsApplication.class, args);
	}

}
// https://springawsnew.s3.amazonaws.com/Spring-boot-AWS-application.jar