package com.kdh.cafe.cart.impl;

import java.util.HashMap;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class cartDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertCart(HashMap<String, Object> map)
	{
		mybatis.insert("cartDAO.insertCart",map);
	}
}
