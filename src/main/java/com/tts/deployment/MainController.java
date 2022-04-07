package com.tts.deployment;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @RequestMapping("/") //http:localhost:8080/
    public String home() {
        return "Look Ma, no localhost!";
    }
}


