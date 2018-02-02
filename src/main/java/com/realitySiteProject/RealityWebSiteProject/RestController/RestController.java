package com.realitySiteProject.RealityWebSiteProject.RestController;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping("/api/hello")
    public String greet() {
        return "Greetings stranged";
    }

    @RequestMapping("/api")
    public String baf() {
        return "BAF";
    }
}

