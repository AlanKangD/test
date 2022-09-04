package com.care.root.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class memberSericeImpl implements memberService {
	
	@Autowired MemberMapper mapper;
	
	@Override
	public void register(MemberVO vo) {
		
//		System.out.println("id : " + id + " pw :" + pw );
//		MemberVO vo = new MemberVO();
//		vo.setId(id);
//		vo.setPw(pw);
		System.out.println(vo.getId());
		System.out.println(vo.getPw());
		
		mapper.register(vo);
		
		
	}
	
	

}
