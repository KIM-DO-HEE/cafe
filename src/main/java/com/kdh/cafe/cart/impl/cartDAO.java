package com.kdh.cafe.cart.impl;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kdh.cafe.cart.cartVO;

@Repository
public class cartDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertCart(HashMap<String, Object> map)
	{
		mybatis.insert("cartDAO.insertCart",map);
	}
	
	public List<cartVO> getCartList(HashMap<String, Object> map)
	{
		return mybatis.selectList("cartDAO.getCartList",map);
	}
}
