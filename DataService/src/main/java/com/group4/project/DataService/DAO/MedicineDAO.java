package com.group4.project.DataService.DAO;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.group4.project.DataService.Model.MedicineProduct;

import com.group4.project.DataService.Repository.MedicineRepository;

@RestController
public class MedicineDAO {
	@Autowired
	MedicineRepository medicine;
	
	@RequestMapping(method=RequestMethod.POST,value="medecine/create")
	public void create(@RequestBody MedicineProduct m) {
		medicine.save(m);
	
	}
	
	@RequestMapping(method=RequestMethod.GET,value="medicine/present/{id}")
	public boolean isPresent(@PathVariable String id) {
		return medicine.existsById(id);
	}

}
