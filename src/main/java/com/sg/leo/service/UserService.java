package com.sg.leo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sg.leo.domain.RoleType;
import com.sg.leo.domain.User;
import com.sg.leo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userReposiotry;
	
	@Transactional
	public void insertUser(User user) {
		user.setRole(RoleType.USER);
		userReposiotry.save(user);
	}
	
	@Transactional
	public User getUser(String username) {
		User findUser = userReposiotry.findByUsername(username).get();
		return findUser;
	}
}
