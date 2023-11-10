package com.test.sp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TmplController {
	@GetMapping("/tmpl/**") //classpath: templates/tmpl/index.html
	public void goPage() {
		
	}
	@GetMapping("/")
		public String home() {
			return "tmpl/index";
		
	}
}
