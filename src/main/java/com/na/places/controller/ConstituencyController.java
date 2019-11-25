package com.na.places.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.na.places.entity.Constituency;
import com.na.places.service.Service;
/**
 * Controller to return all the constituencies
 * @author amon
 *
 */
@RestController
@RequestMapping("places/constituencies")
public class ConstituencyController {
	
	@Autowired
	private Service service;
	
	@GetMapping
	public List<Constituency> getAllConstituencies()
	{
		return service.getAllConstituencies();
	}

}
