package com.brand13.book_ex.vo;

import java.util.Date;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class BoardVO {
    private final int bno;
    private final String title;
    private final String content;
    private final String writer;
    private final Date regdate;
    private final int viewcnt;
}
