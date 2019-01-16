package com.group4.project.DataService.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.group4.project.DataService.Model.BodyCareProduct;

import com.group4.project.DataService.Repository.BodyCareRepository;

@RestController
public class BodyCareDAO {
	
	@Autowired
	BodyCareRepository bodycare;
	
	@RequestMapping(method=RequestMethod.POST,value="bodycare/create")
	public void create(@RequestBody BodyCareProduct bo) {
		bodycare.save(bo);
	
	}
	
	@RequestMapping(method=RequestMethod.GET,value="bodycare/present/{id}")
	public boolean isPresent(@PathVariable String id) {
		return bodycare.existsById(id);
	}

}
