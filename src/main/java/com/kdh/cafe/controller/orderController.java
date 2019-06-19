package com.kdh.cafe.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kdh.cafe.cart.cartVO;
import com.kdh.cafe.order.orderService;
import com.kdh.cafe.user.userVO;

@Controller
public class orderController {
	
	@Autowired
	private orderService service;
	
	@RequestMapping("/insertOrder")
	public void insertOrder(cartVO vo, HttpSession session)
	{
		HashMap map = new HashMap<String, Object>();
		userVO user = (userVO)session.getAttribute("userVO");
		String userId = user.getUserId();
		//System.out.println(vo.getMenuId());
		List<cartVO> cart = (List<cartVO>)session.getAttribute("cartList");
		map.put("userId", userId);
		map.put("cartList",cart);	
		//System.out.println(map.get("cartList"));
		//map.put("cartList", cart);
//		map.put("userId", userId);
//		int menuId = vo.getMenuId();
//		String menuName = vo.getMenuName();
//		int menuPrice = vo.getMenuPrice();
//		
//		map.put("userId", userId);
//		map.put("menuId",menuId);
//		map.put("menuName",menuName);
//		map.put("menuPrice",menuPrice);
//		
//		Iterator<String> keys = map.keySet().iterator();
//		while(keys.hasNext()) {
//			String key = keys.next();
//		System.out.println(String.format("Å° : %s, °ª: %s", key, map.get(key)));
//		
//		}
		service.insertOrder(map);	
		//return "index";
	}
}
