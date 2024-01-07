package com.brand13.book_ex.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    
    private static final Logger logger = LoggerFactory.getLogger(SampleController.class);

    @GetMapping("/doA")
    public void doA(){
        logger.info("doA called.......");
    }
    
    @GetMapping("/doB")
    public void doB(){
        logger.info("doB called.......");
    }
    
    @GetMapping("/doC") // /doC?msg=??
    public String doC(@RequestParam(required = false) String msg){
        logger.info("doC called.......");
        return msg;
    }
}
