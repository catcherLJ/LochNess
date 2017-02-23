package com.monster.lochness.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by CatcherLJ
 * Date:2017/2/23
 * Time:13:42
 */
@RestController
public class LoginController {

    @RequestMapping("/")
    public String indexPage() {
        return "index";
    }



}
