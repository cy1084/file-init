package com.test.sp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zaxxer.hikari.HikariDataSource;

@RestController
//responseBody 생략
public class DBController {
	@Autowired
	private HikariDataSource ds;

	@GetMapping("/ds")
	public String ds(@ModelAttribute UserVO user) {

		return "get: "+user;

	}

	@GetMapping("/ds/{name}/{age}")
	public String dsblur(@PathVariable("name") String name, @PathVariable("age") int age) {

		return "getname";

	}

	@PostMapping("/ds")

	public String ds2(@RequestBody(required=false) UserVO user) {

		return "post: "+user;

	}
}
