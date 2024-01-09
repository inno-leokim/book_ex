package com.brand13.book_ex.service;

import java.util.List;

import com.brand13.book_ex.vo.MemberVo;

public interface MemberService {
    public List<MemberVo> getAllMember();
    public String getTime();
    public void insertMember(MemberVo vo);
}
