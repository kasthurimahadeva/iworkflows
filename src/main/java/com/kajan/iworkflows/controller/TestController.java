package com.kajan.iworkflows.controller;

import com.kajan.iworkflows.exception.UnauthorizedException;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class TestController {

    @GetMapping
    public String getTestPage() {
        return "test";
    }

    @GetMapping("/500")
    public String simulate500() {
        String a = "panda";
        a.charAt(50);
        return null;
    }

    @GetMapping("/401")
    public String simulate401() {
        throw new UnauthorizedException();
    }

}
