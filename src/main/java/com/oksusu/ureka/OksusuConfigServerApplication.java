package com.oksusu.ureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class OksusuConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OksusuConfigServerApplication.class, args);
	}
}
