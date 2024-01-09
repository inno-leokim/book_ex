package com.brand13.book_ex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brand13.book_ex.vo.ProductVo;

@RestController
public class SampleController05 {
    
    @GetMapping("/doJSON")
    public ProductVo doJSON(){
        ProductVo vo = new ProductVo("샘플상품", 30000);

        return vo;
    }
}
