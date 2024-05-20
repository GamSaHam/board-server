package com.fastcampus.boardserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String main() {
        return "메인입니다3.";
    }

    @GetMapping("/v2")
    public String getTest() {
        return "test";
    }

}
