package com.care.root.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class memberController {
	
	@Autowired memberService ms;
	
	@RequestMapping("login")
	public String testmember() {
		
		return "member/login";
	}
	@GetMapping("member/register")
	public String register(MemberVO vo) {
//		System.out.println("id" + id);
//		System.out.println("pw" +pw);
		System.out.println(vo.getId());
		System.out.println(vo.getPw());
		
		
		ms.register(vo);
		
		return "member/loginForm";
	}
	
}
