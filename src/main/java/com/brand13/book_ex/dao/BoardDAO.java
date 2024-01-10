package com.brand13.book_ex.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.brand13.book_ex.vo.BoardVO;

@Mapper
public interface BoardDAO {
    
    public void create(BoardVO vo) throws Exception;

    public BoardVO read(int bno) throws Exception;

    public void update(BoardVO vo) throws Exception;

    public void delete(int bno) throws Exception;

    public List<BoardVO> listAll() throws Exception;
}
