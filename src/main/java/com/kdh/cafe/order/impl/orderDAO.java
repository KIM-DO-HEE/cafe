package com.kdh.cafe.order.impl;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kdh.cafe.cart.cartVO;

@Repository
public class orderDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;

	public void insertOrder(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
//		for(HashMap.Entry<String, Object> entry : map.entrySet()) {
//			System.out.println("key"+entry.getKey() + "value"+entry.getValue());
//			
//		}
		//HashMap<String, Object> map1 = new HashMap<String, Object>(); 
		System.out.println(map.get("cartList"));
		List<cartVO> cartlist = (List<cartVO>) map.get("cartList");
		mybatis.insert("orderDAO.insertOrder", map);
		for(int i = 0 ; i < cartlist.size(); i++)
		{
			HashMap<String, Object> map1 = new HashMap<String, Object>(); 
			map1.put("userId", map.get("userId"));
			map1.put("menuId", cartlist.get(i).getMenuId());
			map1.put("menuName", cartlist.get(i).getMenuName());
			map1.put("menuPrice", cartlist.get(i).getMenuPrice());
			mybatis.insert("orderDAO.insertOrderList", map1);
//			System.out.println(cartlist.get(i).getMenuId());
//			System.out.println(cartlist.get(i).getMenuName());
//			System.out.println(cartlist.get(i).getMenuPrice());
		}
		
		//mybatis.insert("orderDAO.insertOrder", map);
		//mybatis.insert("orderDAO.insertOrderList", map);
	}
}
