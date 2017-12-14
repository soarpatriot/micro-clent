package com.xiaojiuwo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liuhaibao on 2017/12/13.
 */

@RestController
@RequestMapping("/hello")
public class HelloController {



    @GetMapping({"","/"})
    public String world() {

        return "world!";
    }


}
