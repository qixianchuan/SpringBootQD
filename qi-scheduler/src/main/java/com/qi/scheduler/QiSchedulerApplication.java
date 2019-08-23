package com.qi.scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class QiSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(QiSchedulerApplication.class, args);
	}

}
