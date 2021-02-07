package com.prac.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BlogControllerTest {
	@GetMapping("/test/hello")
	public @ResponseBody String hello() {
		return "<h1>hello spring boot</h1>";
	}
}
