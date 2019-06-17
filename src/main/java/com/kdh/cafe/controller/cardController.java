package com.kdh.cafe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kdh.cafe.card.cardService;
import com.kdh.cafe.card.cardVO;

@Controller
public class cardController {
	
	@Autowired
	private cardService service;
	
	@RequestMapping("/insertCard")
	public void insertCard(cardVO vo) 
	{
		service.insertCard(vo);
	}
}
