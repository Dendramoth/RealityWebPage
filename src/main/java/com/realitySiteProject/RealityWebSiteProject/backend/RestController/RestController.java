package com.realitySiteProject.RealityWebSiteProject.backend.RestController;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collections;
import java.util.Map;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping(value = "/api/hello", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Map greet() {
        return Collections.singletonMap("response", "Hello World");
    }

    @RequestMapping("/api")
    public String baf() {
        return "BAF";
    }
}

