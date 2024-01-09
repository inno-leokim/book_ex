package com.brand13.book_ex.controller;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class SampleController04 {
    
    private static final Logger logger = LoggerFactory.getLogger(SampleController04.class);

    @GetMapping("/doE")
    public void doE(HttpServletResponse response) throws IOException{

        logger.info("doE called but redirect to /doF.....................");
        String redirect_uri="http://localhost:8080/doF/brand13";

        response.sendRedirect(redirect_uri);
    }

    @GetMapping("/doF/{msg}")
    public String doF(@PathVariable("msg") String msg){
        logger.info("doF called.............. " + msg);
        return "doF called.............. " + msg;
    }
}
