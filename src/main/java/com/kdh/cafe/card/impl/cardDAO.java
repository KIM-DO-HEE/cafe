package com.kdh.cafe.card.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kdh.cafe.card.cardVO;

@Repository
public class cardDAO {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertCard(cardVO vo) {
		mybatis.insert("cardDAO.insertCard",vo);
	}
	
	
}
