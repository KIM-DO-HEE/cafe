package com.kdh.cafe.menu;

import java.util.List;

public interface menuService {
	void insertMenu(menuVO vo);
	void updateMenu(menuVO vo);
	menuVO getMenuDetail(menuVO vo);
	List<menuVO> getMenuList(menuVO vo);
	void deleteMenu(menuVO vo);
}
