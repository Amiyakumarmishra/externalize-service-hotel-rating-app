package com.amiya.externalize;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ExternalizeMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExternalizeMsApplication.class, args);
	}

}
