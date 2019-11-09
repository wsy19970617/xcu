package cn.edu.xcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/mm")
	public String m() {
		return "main";
	}
}
