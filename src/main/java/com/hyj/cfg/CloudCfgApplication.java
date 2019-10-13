package com.hyj.cfg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
@ServletComponentScan
public class CloudCfgApplication {
	@Value("${hyj}")
	private static String hyj;
	public static void main(String[] args) {
		SpringApplication.run(CloudCfgApplication.class, args);
		System.out.println(hyj);
	}

}
