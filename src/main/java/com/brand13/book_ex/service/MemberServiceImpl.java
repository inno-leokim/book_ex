package com.brand13.book_ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brand13.book_ex.dao.MemberDAO;
import com.brand13.book_ex.repository.MemberRepository;
import com.brand13.book_ex.vo.MemberVo;

@Service
public class MemberServiceImpl implements MemberService{

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private MemberDAO memberDAO;

    @Override
    public List<MemberVo> getAllMember() {
        return memberRepository.getAllMember();
    }

    @Override
    public String getTime() {
        return memberDAO.getTime();
    }

    @Override
    public void insertMember(MemberVo vo) {
        memberDAO.insertMember(vo);
        System.out.println("success");
    }
    
}
