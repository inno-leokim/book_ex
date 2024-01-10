package com.brand13.book_ex.service;

import java.util.List;

import com.brand13.book_ex.vo.BoardVO;

public interface BoardService {
    
    public void regist(BoardVO boardVO) throws Exception;
    
    public BoardVO read(int bno) throws Exception;
    
    public void modify(BoardVO boardVO) throws Exception;

    public void remove(int bno) throws Exception;

    public List<BoardVO> listAll() throws Exception;
}
