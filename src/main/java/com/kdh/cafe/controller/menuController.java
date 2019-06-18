package com.kdh.cafe.controller;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.kdh.cafe.menu.menuService;
import com.kdh.cafe.menu.menuVO;

@Controller
public class menuController {
	
	@Autowired
	private menuService service;
	
	//�޴� �߰�
	@RequestMapping(value="/insertMenu")
	public String insertMenu(menuVO vo) throws Exception
	{
		MultipartFile uploadFile = vo.getImage();
		if(!uploadFile.isEmpty()) {
			String fileName = uploadFile.getOriginalFilename();
			uploadFile.transferTo(new File("C:/image/"+fileName));
		}
		service.insertMenu(vo);
		return "index";
	}
	
	//�޴� ����
	@RequestMapping(value="/updateMenu")
	public String updateMenu(@RequestParam("menuId") int menuId, menuVO vo)
	{
		service.updateMenu(vo);
		return "index";
	}
	
	@RequestMapping(value="/deleteMenu")
	public String deleteMenu(@RequestParam("menuId") int menuId, menuVO vo) {
		service.deleteMenu(vo);
		return "index";
	}
	
	//�޴� �󼼺���
	@RequestMapping(value="/getMenuDetail")
	public String getMenuDetail(@RequestParam("menuId") int menuId, menuVO vo, Model model)
	{
		model.addAttribute("menu",service.getMenuDetail(vo));
		return "menuDetail";
	}
	
	// �޴� ����Ʈ ��ȸ
	@RequestMapping(value="/getMenuList")
	public String getMenuList(menuVO vo, Model model)
	{
		model.addAttribute("menuList",service.getMenuList(vo));
		return "getMenuList";
	}
}
