package com.monster.lochness.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
/**
 * Created by CatcherLJ
 * Date:2017/2/23
 * Time:10:20
 */
@SpringBootApplication(scanBasePackages = "com.monster.lochness")
public class LochNessApplication {

    //private static final Logger log = LoggerFactory.getLogger(LochNessApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(LochNessApplication.class, args);
    }

}
