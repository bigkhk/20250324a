package edu.fisa.ce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CICDController {
	
	//http://localhost/fisa1
	@GetMapping("fisa1")
	public String reqRes() {
		System.out.println("reqRes() *******");
		return "요청 응답 성공";
	}

	//http://localhost/fisa1
	@GetMapping("fisa2")
	public String reqRes() {
		try{
			System.out.println("reqRes() *******");
		}catch(Exception e){}
		return "요청 응답 성공";
	}
	
}
