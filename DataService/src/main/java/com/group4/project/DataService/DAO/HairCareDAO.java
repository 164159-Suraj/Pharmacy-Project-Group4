package com.group4.project.DataService.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.group4.project.DataService.Model.HairCareProduct;

import com.group4.project.DataService.Repository.HairCareRepository;

@RestController
public class HairCareDAO {
	@Autowired
	HairCareRepository haircare;
	
	@RequestMapping(method=RequestMethod.POST,value="haircare/create")
	public void create(@RequestBody HairCareProduct h) {
		haircare.save(h);
	
	}
	
	@RequestMapping(method=RequestMethod.GET,value="haircare/present/{id}")
	public boolean isPresent(@PathVariable String id) {
		return haircare.existsById(id);
	}

}
