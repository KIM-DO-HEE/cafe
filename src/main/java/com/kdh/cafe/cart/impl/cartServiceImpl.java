package com.kdh.cafe.cart.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kdh.cafe.cart.cartService;
import com.kdh.cafe.cart.cartVO;
import com.kdh.cafe.menu.menuVO;

@Service
public class cartServiceImpl implements cartService{
	
	@Autowired
	private cartDAO dao;

	@Override
	public void insertCart(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		dao.insertCart(map);
	}

	@Override
	public List<cartVO> getCartList(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		return dao.getCartList(map);
	}

}
