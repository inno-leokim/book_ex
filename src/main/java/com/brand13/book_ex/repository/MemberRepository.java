package com.brand13.book_ex.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.brand13.book_ex.vo.MemberVo;

@Mapper
public interface MemberRepository {
    
    List<MemberVo> getAllMember();
}
