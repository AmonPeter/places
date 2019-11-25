package com.na.places.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.na.places.entity.Town;
import com.na.places.service.Service;

/**
 * Controller to return all the towns
 * @author amon
 *
 */
@RestController
@RequestMapping("places/towns")
public class TownsController {

	@Autowired
	private Service service;
	
	@GetMapping
	public List<Town> getAllTowns()
	{	
		return service.getAllTowns();
	}
}
