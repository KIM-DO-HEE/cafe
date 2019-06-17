package com.kdh.cafe.card.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kdh.cafe.card.cardService;
import com.kdh.cafe.card.cardVO;

@Service
public class cardServiceImpl implements cardService {
	
	@Autowired
	private cardDAO dao;

	@Override
	public void insertCard(cardVO vo) {
		// TODO Auto-generated method stub
		
	}
	
}
