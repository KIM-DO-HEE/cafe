package com.kdh.cafe.menu.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kdh.cafe.menu.menuService;
import com.kdh.cafe.menu.menuVO;

@Service
public class menuServiceImpl implements menuService {
	
	@Autowired
	private menuDAO dao;

	@Override
	public void insertMenu(menuVO vo) {
		// TODO Auto-generated method stub
		dao.insertMenu(vo);
	}

	@Override
	public void updateMenu(menuVO vo) {
		// TODO Auto-generated method stub
		dao.updateMenu(vo);
	}

	@Override
	public menuVO getMenuDetail(menuVO vo) {
		// TODO Auto-generated method stub
		return dao.getMenuDetail(vo);
	}

	@Override 
	public List<menuVO> getMenuList(menuVO vo) {
		// TODO Auto-generated method stub
		return dao.getMenuList(vo);
	}

	@Override
	public void deleteMenu(menuVO vo) {
		// TODO Auto-generated method stub
		dao.deleteMenu(vo);
	}
	
	
}
