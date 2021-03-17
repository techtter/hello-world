package net.techtter.aws.cicd.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@SpringBootApplication
public class HelloWorldApplication {

    @GetMapping("/world")
    public String getHelloWorld() {
        return " <h1> Hello World.. !! <h/1>";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }

}
