package com.edu.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping("/")
	public String hello(Model model) {
		
		model.addAttribute("message", "Hello boot..!!");
		
		return "hello"; // 이게 forward 역할, hello.html쪽으로
	}
}
