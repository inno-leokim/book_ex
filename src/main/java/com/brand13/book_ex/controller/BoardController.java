package com.brand13.book_ex.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brand13.book_ex.service.BoardService;
import com.brand13.book_ex.vo.BoardVO;

@RequestMapping("/board/*")
@RestController
public class BoardController {
    
    private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

    @Autowired
    private BoardService boardService;

    @GetMapping("/read/{bno}")
    public BoardVO read(@PathVariable("bno") int bno) throws Exception{
        return boardService.read(bno);
    }
}
