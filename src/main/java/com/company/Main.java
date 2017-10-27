package com.company;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.boot.*;

@SpringBootApplication
public class Main {

        public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);
    }
}