package com.kdh.cafe.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kdh.cafe.cart.cartService;
import com.kdh.cafe.cart.cartVO;
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
		return "getMenuList";
	}
	
	
	@RequestMapping("/getCartList")
	public String getCartList(cartVO vo, HttpSession session, Model model) {
		userVO user = (userVO) session.getAttribute("userVO");
		String userId = user.getUserId();
		HashMap map = new HashMap<String, Object>();
		map.put("userId", userId);
		map.put("cart",vo);
		model.addAttribute("cartList",service.getCartList(map));
		
		return "getCartList";
		
		
	}
}
