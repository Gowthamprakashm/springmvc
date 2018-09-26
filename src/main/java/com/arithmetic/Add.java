package com.arithmetic;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Add {

	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest req, HttpServletResponse res) {

		int x = Integer.parseInt(req.getParameter("t1"));
		int y = Integer.parseInt(req.getParameter("t2"));
		int z = 0;

		System.out.println("Add Invoke Successful");

		if(req.getParameter("calc").equals("add"))
			z = x+y;
		else if(req.getParameter("calc").equals("sub"))
			z=x-y;
		else if(req.getParameter("calc").equals("mul"))
			z=x*y;
		else if(req.getParameter("calc").equals("div"))
			z=x/y;
		
		
		ModelAndView mv  =  new ModelAndView();
		mv.setViewName("index.jsp");
		
		mv.addObject("x",x);
		mv.addObject("y",y);
		mv.addObject("z",z);
		return mv;
	}

}
