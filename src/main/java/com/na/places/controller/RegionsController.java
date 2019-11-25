package com.na.places.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.na.places.entity.Region;
import com.na.places.service.Service;

/**
 * Controller to return all the regions
 * @author amon
 *
 */
@RestController
@RequestMapping("places/regions")
public class RegionsController {
	
	@Autowired
	private Service service;
	
	@GetMapping
	public List<Region> getAllRegions()
	{
		return service.getAllRegions();
	}

}
