package com.myJob.example.controller;

import com.myJob.example.service.UserService;
import com.myJob.template.base.ResponseInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: dxjx
 * @description:
 * @date: 2018/10/11
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping
    public String insert(String name, Integer age) {
        userService.insert(name, age);
        log.info("insert:{},{}", name, age);
        return ResponseInfo.resp(200);
    }

    @GetMapping("/{id}")
    public String query(@PathVariable("id") Long id) {
        return ResponseInfo.resp(200, "", userService.findById(id));
    }
}
