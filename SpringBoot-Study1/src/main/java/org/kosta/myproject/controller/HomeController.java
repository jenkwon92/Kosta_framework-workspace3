package org.kosta.myproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping(value={"/","home"})
	public String home() {
		System.out.println("SpringBoot-Study1-home");
		return "home";
	}
}
