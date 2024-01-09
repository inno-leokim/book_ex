package com.brand13.book_ex.dao;

import org.apache.ibatis.annotations.Mapper;

import com.brand13.book_ex.vo.MemberVo;

@Mapper
public interface MemberDAO {
    String getTime();
    void insertMember(MemberVo vo);
}
