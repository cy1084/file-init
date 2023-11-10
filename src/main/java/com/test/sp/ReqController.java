package com.test.sp;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ReqController {

	@PostMapping("/req/post")
	public String reqPost(@RequestBody Map<String, String> param) {
		// 값 가져오기
		// 1. modelAttribute, @requestParam
		// 2. @requestBody
		return "";

	}

	@PostMapping("/req/file")
	public String reqFile(MultipartFile file) {
		log.info("file name=>{}", file.getOriginalFilename());
		return "ok";
	}
}
