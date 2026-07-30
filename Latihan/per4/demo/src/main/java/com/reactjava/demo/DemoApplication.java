package com.reactjava.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RestController
    class PerdanaController {

        @GetMapp("/")
		public String hello() {
            return "Hello World!";
        }
    }
}
