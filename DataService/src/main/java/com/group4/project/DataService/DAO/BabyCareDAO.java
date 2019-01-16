package com.group4.project.DataService.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.group4.project.DataService.Model.BabyCareProduct;
import com.group4.project.DataService.Repository.BabyCareRepository;

@RestController
public class BabyCareDAO {
	@Autowired
	BabyCareRepository babycare;
	
	@RequestMapping(method=RequestMethod.POST,value="babycare/create")
	public void create(@RequestBody BabyCareProduct ba) {
		babycare.save(ba);
		
	
	}
	
	@RequestMapping(method=RequestMethod.GET,value="babycare/present/{id}")
	public boolean isPresent(@PathVariable String id) {
		return babycare.existsById(id);
	}

}


