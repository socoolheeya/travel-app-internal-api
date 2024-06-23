package com.socoolheeya.travel.app.internal.api.core;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("")
    public String main() {
        return "hello world!";
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
