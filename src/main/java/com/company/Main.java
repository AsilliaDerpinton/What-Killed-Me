package com.company;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.boot.*;

@Controller
@EnableAutoConfiguration
public class Main {

        public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);
    }
}