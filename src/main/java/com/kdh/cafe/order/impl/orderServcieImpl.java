package com.kdh.cafe.order.impl;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kdh.cafe.order.orderListVO;
import com.kdh.cafe.order.orderService;
import com.kdh.cafe.order.orderVO;

@Service
public class orderServcieImpl implements orderService {
	
	@Autowired
	private orderDAO dao;

	@Override
	public void insertOrder(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		dao.insertOrder(map);
	}

	@Override
	public void updateOrder(orderVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOrder(orderVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertOrderList(orderListVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<orderVO> getOrder(orderVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<orderListVO> getOrderList(orderListVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

}
