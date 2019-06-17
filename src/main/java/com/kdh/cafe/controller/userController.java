package com.kdh.cafe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kdh.cafe.user.userService;
import com.kdh.cafe.user.userVO;

@Controller
public class userController {
	
	@Autowired
	private userService service;
	
	//메뉴 추가
	@RequestMapping(value = "/insertUser", method=RequestMethod.POST)
	public String insertUser(userVO vo)
	{
//		if(vo.getUserId() == null || vo.getUserId().equals("")) {
//			throw new IllegalArgumentException("아이디를 입력하세요");
//		}
		service.insertUser(vo);
		return "index"; 
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String login(userVO vo)
	{
		if(service.loginUser(vo) !=  null)
		{
			return "index";
		}else {
			return "login";
		}
	}
}
