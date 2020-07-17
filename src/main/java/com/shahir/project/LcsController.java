package com.shahir.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LcsController {

	@GetMapping("/lcslandingpage")
	public String lcs() {
		return "lcslandingpage";
	}

}