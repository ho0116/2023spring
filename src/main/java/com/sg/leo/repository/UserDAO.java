package com.sg.leo.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sg.leo.domain.User;

@Repository
public class UserDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void inserUser(User user) {
		mybatis.insert("inserUser", user);
	}
	
	public void updateUser(User user) {
		mybatis.insert("updateUser", user);
	}
	
	public void deleteUser(User user) {
		mybatis.insert("deleteUser", user);
	}
	
	public User getUser(User user) {
		return mybatis.selectOne("getUser", user);
	}
	
	public List<User> getUserList(){
		return mybatis.selectList("getUserList");
	}
}
