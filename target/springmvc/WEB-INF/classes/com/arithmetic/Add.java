package com.arithmetic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Add {

	@RequestMapping("/add")
	public void add() {
		System.out.println("Add Invoke Successful");
	}
	
}
