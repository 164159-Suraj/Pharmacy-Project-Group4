package com.arpita.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arpita.model.User;
import com.arpita.repost.UserRepos;

@RestController
//@RequestMapping("/api")
public class Controller {
	@Autowired
	UserRepos userRep;
	//@PostMapping("users/create")
	@RequestMapping(method=RequestMethod.POST,value="api/users/create")
	void createUser(@RequestBody User u) {
		userRep.save(u);
	}

}
