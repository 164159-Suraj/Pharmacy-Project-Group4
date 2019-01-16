package com.group4.project.DataService.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.group4.project.DataService.Model.User;
import com.group4.project.DataService.Repository.UserRepository;

@RestController
public class UserDAO {
	
	@Autowired
	UserRepository user;
	
	@RequestMapping(method=RequestMethod.POST,value="user/create")
	public void create(@RequestBody User u) {
		user.save(u);
	
	}
	
	@RequestMapping(method=RequestMethod.GET,value="user/present/{id}")
	public boolean isPresent(@PathVariable String id) {
		return user.existsById(id);
	}
	
	@RequestMapping("user/total")
	public long total() {
		return user.count();
	}

}
