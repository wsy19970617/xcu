package cn.edu.xcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//控制器类
@Controller
public class HelloController {
	@RequestMapping("/hw1")
	public String hw() {
		return "hello";
	}
}
