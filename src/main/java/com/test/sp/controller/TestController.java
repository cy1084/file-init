package com.test.sp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.sp.CalcVO;

@Controller
public class TestController {
	@GetMapping("/add/param")
	public String getParam(int num1,int num2, Model m) {
		m.addAttribute("result",num1+num2);
		return "tmpl/result";
	}
	
	@GetMapping("/add/ajax")
	@ResponseBody
	public int getAjax(int num1,int num2) {
		
		return num1+num2;
	}
	
	@GetMapping("/add/model") //vo로
	public String getModel(CalcVO calc, Model m) {
		calc.setResult(calc.getNum1()+calc.getNum2());
		m.addAttribute("calc",calc);
		return "tmpl/result";
	}
	
	@GetMapping("/substract/param")
	public String getParam2(int num1,int num2, Model m) {
		m.addAttribute("result",num1-num2);
		return "tmpl/result";
	}
	
	@GetMapping("/substract/ajax")
	@ResponseBody
	public int getAjax2(int num1,int num2) {
		
		return num1-num2;
	}
	
	@GetMapping("/substract/model") 
	public String getModel2(CalcVO calc, Model m) {
		calc.setResult(calc.getNum1()-calc.getNum2());
		m.addAttribute("calc",calc);
		return "tmpl/result";
	}
}
