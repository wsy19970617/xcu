package cn.edu.xcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HolloController {
	@RequestMapping("/hw")
	public String hw() {
		return "hello";
	}
}
