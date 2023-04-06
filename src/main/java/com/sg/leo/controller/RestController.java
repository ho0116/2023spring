package com.sg.leo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import com.sg.leo.domain.User;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	@GetMapping("/tblog")
	public User httpGet() {
		User finder = User.builder().id(1).username("ai").password("222").email("ai@gmail.com").build();
		return finder;
	}
	
	@PostMapping("/tblog")
	public String httpPost(@RequestBody User user) {
		return "Post요청 처리" + user.toString();
	}
	
	@PutMapping("/tblog")
	public String httpPut() {
		return "Put request 처리";
	}
	
	@DeleteMapping("/tblog")
	public String httDelete(@RequestParam int id) {
		return "Delete 요청처리 id: " + id;
	}
}
