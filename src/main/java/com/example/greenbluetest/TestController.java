package com.example.greenbluetest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestController {

    @GetMapping("/")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("v1.5");
    }

}
