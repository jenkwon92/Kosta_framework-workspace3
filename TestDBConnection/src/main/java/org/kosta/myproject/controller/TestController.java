package org.kosta.myproject.controller;

import org.kosta.myproject.model.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	private TestMapper testMapper;
	@Autowired
	public TestController(TestMapper testMapper) {
		super();
		this.testMapper = testMapper;
	}
	@RequestMapping("dbTest")
	public String dbTest(Model model) {
		model.addAttribute("imgname",testMapper.dbTest());
		
		return "test";
	}
}
