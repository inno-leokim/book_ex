package com.brand13.book_ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brand13.book_ex.dao.BoardDAO;
import com.brand13.book_ex.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardDAO boardDAO;

    @Override
    public void regist(BoardVO boardVO) throws Exception {
        boardDAO.create(boardVO);
    }

    @Override
    public BoardVO read(int bno) throws Exception {
        System.out.println(bno);
        return boardDAO.read(bno);
    }

    @Override
    public void modify(BoardVO boardVO) throws Exception {
        boardDAO.update(boardVO);
    }

    @Override
    public void remove(int bno) throws Exception {
        boardDAO.delete(bno);
    }

    @Override
    public List<BoardVO> listAll() throws Exception {
        return boardDAO.listAll();
    }
    
}
