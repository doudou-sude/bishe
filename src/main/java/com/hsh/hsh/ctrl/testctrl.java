package com.hsh.hsh.ctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testctrl {
    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name) {

        return "Hi" + name;
    }
}
