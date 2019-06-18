package com.kdh.cafe.userImpl;

import org.apache.ibatis.session.ResultHandler;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kdh.cafe.user.userVO;

@Repository
public class userDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertUser(userVO vo) {
		mybatis.insert("userDAO.insertUser",vo);
		mybatis.insert("userDAO.insertCart",vo);
	}
	
	
	public userVO login(userVO vo)
	{
		return mybatis.selectOne("userDAO.login", vo);
	}
	/*public void updateUser(userVO vo) {
		mybatis.update("userDAO.updateUser",vo);
	}
	
	public void deleteUser(userVO vo) {
		mybatis.delete("userDAO.deleteUser",vo);
	}*/
}
