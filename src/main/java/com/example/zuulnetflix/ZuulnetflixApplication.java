package com.example.zuulnetflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulnetflixApplication {

	public static void main(final String[] args) {
		SpringApplication.run(ZuulnetflixApplication.class, args);
	}

}
