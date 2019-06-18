package com.kdh.cafe.controller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kdh.cafe.cart.cartService;
import com.kdh.cafe.menu.menuVO;
import com.kdh.cafe.user.userVO;

@Controller
public class cartController {
	
	@Autowired
	private cartService service;
	
	@RequestMapping("/insertCart")
	public String insertCart(menuVO vo, HttpSession session){
		userVO user = (userVO) session.getAttribute("userVO");
		int cartNo = user.getCartNo();
		int menuId = vo.getMenuId();
		String menuName = vo.getMenuName();
		int menuPrice = vo.getMenuPrice();
		HashMap map = new HashMap<String, Object>();
		map.put("user", cartNo);
		map.put("menuId",menuId );
		map.put("menuName", menuName);
		map.put("menuPrice", menuPrice);
		//System.out.println();
		service.insertCart(map);
		//System.out.println(user.getCartNo());
//		System.out.println(map.get("user"));
//		System.out.println(map.get("menu"));
		return "index";
	}
}
