package org.kosta.myproject.controller;

import javax.annotation.Resource;

import org.kosta.myproject.model.domain.MemberVO;
import org.kosta.myproject.model.domain.PointVO;
import org.kosta.myproject.model.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	@Resource
	private MemberService memberService;
	@RequestMapping("findMemberById")
	public String findMemberById(String id,Model model) {
		model.addAttribute("memberVO", memberService.findMemberById(id));
		return "find-member-result";
	}
	@PostMapping("register")
	public String register(MemberVO memberVO,PointVO pointVO) {
		//MemberServiceImpl 객체가 아닌 AOP Proxy (대리인) 객체가 주입되어 동작된다
		System.out.println(memberService.getClass().getName()); //cglib?
		memberService.register(memberVO, pointVO);
		return "redirect:registerResult";
	}
	@RequestMapping("registerResult")
	public String registerResult() {
		return "register-result";
	}	
}










