package com.brand13.book_ex.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.RequiredArgsConstructor;

@Setter
@Getter
@RequiredArgsConstructor
public class ProductVo {
    private final String name;
    private final double price;

    @Override
    public String toString(){
        return "ProductVO [name=" + name + ", price=" + price + "]";
    }
}

