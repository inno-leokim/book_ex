package com.brand13.book_ex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brand13.book_ex.service.MemberService;
import com.brand13.book_ex.vo.MemberVo;

@RestController
@RequestMapping("/")
public class MemberController {
    
    @Autowired
    private MemberService memberService;

    @GetMapping("/")
    public List<MemberVo> index(){
        List<MemberVo> memberList = memberService.getAllMember();
        System.out.println("size: " + memberList.size());

        return memberList;
    }

    @GetMapping("/time")
    public String getTime(){
        return memberService.getTime();
    }

    @GetMapping("/member")
    public MemberVo addMember(){
        MemberVo memberVo = new MemberVo("brand13", "1233", "yun", "a@b.com");
        
        memberService.insertMember(memberVo);

        return memberVo;
    }
}
