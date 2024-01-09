package com.brand13.book_ex.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brand13.book_ex.vo.ProductVo;

@RestController
public class SampleController03 {

    private static final Logger logger = LoggerFactory.getLogger(SampleController03.class);

    @GetMapping("/doD")
    public String doD(){
        
        ProductVo productVo = new ProductVo("Sample Product", 10000);
        logger.info("doD");
        return productVo.toString();
    }
}
