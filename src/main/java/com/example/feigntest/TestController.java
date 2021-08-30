package com.example.feigntest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping("/")
    public String main() {
        return testService.test();
    }

    @GetMapping("/test")
    public String test() {
        return "success!";
    }
}
