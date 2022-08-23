package com.example.Demo23;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

@Controller
@SpringBootApplication
public class Demo23Application {

    @RequestMapping("/landingScreen")
    @ResponseBody
    String home() {
      return "Welcome merc to the training !!!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Demo23Application.class, args);
    }
}