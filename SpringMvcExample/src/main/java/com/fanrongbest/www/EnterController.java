package com.fanrongbest.www;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/blue")
@Controller
public class EnterController {
	
	@RequestMapping("/helloWorld")
	public String helloWorld(){
		 return "success";
	 }
	
}
