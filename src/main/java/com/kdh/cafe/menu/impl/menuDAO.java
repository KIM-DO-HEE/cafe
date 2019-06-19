package com.kdh.cafe.menu.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kdh.cafe.menu.menuVO;

@Repository
public class menuDAO {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertMenu(menuVO vo)
	{
		mybatis.insert("menuDAO.insertMenu",vo);
	}
	
	public void updateMenu(menuVO vo)
	{
		mybatis.update("menuDAO.updateMenu",vo);
	}
	
	public menuVO getMenuDetail(menuVO vo)
	{
		return mybatis.selectOne("menuDAO.getMenuDetail", vo);
	}
	
	public List<menuVO> getMenuList(menuVO vo)
	{
		return mybatis.selectList("menuDAO.getMenuList", vo);
	}
	
	public void deleteMenu(menuVO vo)
	{
		mybatis.delete("menuDAO.deleteMenu",vo);
	}
}
