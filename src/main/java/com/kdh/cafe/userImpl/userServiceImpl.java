package com.kdh.cafe.userImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kdh.cafe.user.userService;
import com.kdh.cafe.user.userVO;

@Service
public class userServiceImpl implements userService{
	
	@Autowired
	private userDAO dao;

	@Override
	public void insertUser(userVO vo) {
		// TODO Auto-generated method stub
		dao.insertUser(vo);
	}

	@Override
	public String loginUser(userVO vo) {
		// TODO Auto-generated method stub
		return dao.login(vo);
	}


	
}
 