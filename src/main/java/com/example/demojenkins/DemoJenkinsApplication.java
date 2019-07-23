package com.example.demojenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoJenkinsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoJenkinsApplication.class, args);
    }

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return "1234556";
    }

}
