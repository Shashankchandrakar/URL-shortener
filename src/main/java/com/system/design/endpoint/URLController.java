package com.system.design.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class URLController {

    @GetMapping("/")
    public String getClassName(){
        return this.getClass().getSimpleName();
    }
}
