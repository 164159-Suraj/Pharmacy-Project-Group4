package com.group4.project.DataService.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.group4.project.DataService.Model.SkinCareProduct;

import com.group4.project.DataService.Repository.SkinCareRepository;

@RestController
public class SkinCareDAO {
	@Autowired
	SkinCareRepository skincare;
	
	@RequestMapping(method=RequestMethod.POST,value="skincare/create")
	public void create(@RequestBody SkinCareProduct s) {
		skincare.save(s);
	
	}
	
	@RequestMapping(method=RequestMethod.GET,value="skincare/present/{id}")
	public boolean isPresent(@PathVariable String id) {
		return skincare.existsById(id);
	}

}
