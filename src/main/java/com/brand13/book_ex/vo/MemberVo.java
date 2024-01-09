package com.brand13.book_ex.vo;

// import java.util.Date;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class MemberVo {
	private final String userid;	
    private final String userpw;
	private final String username;
	private final String email;
	// private Date regdate;
	// private Date updateDate;
}
