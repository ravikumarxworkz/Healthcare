package com.pentagon.Healthcare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@GetMapping("path")
	public String getMethodName(@RequestParam String email, @RequestParam String password) {

		return "login successfully";
	}

}
