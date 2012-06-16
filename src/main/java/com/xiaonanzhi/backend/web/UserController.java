package com.xiaonanzhi.backend.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xiaonanzhi.backend.domain.User;
import com.xiaonanzhi.backend.service.UserService;

/**
 * 
 * @author zhaopoingfei
 *
 * 2012-4-15
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/show/{id}")
	public ModelAndView showUser(@PathVariable int id){
		ModelAndView mv = new ModelAndView();
		User user = userService.getUserById(id);
		mv.addObject(user);
		return mv;
	}
	
	
	public ModelAndView showMyMarker(){
		ModelAndView mv = new ModelAndView();
		
		return mv;
	}

	
	

}
