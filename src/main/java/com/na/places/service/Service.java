package com.na.places.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.na.places.entity.Constituency;
import com.na.places.entity.Region;
import com.na.places.entity.Town;
import com.na.places.repository.TownRepository;
import com.na.places.repository.ConstituencyRepository;
import com.na.places.repository.RegionRepository;

/**
 * Service class to get data from the DB
 * @author amon
 *
 */
@Component
public class Service {

	@Autowired
	private TownRepository	townsRepository;
	
	@Autowired
	private RegionRepository regionRepository;
	
	@Autowired
	ConstituencyRepository constituencyRepository;
	
	/**
	 * Get a list of all the towns
	 * @return a list of all the towns
	 */
	public List<Town> getAllTowns()
	{	
		return townsRepository.findAll();
	}
	
	/**
	 * Get a list of all the regions
	 * @return a list of all the regions
	 */
	public List<Region> getAllRegions()
	{
		return regionRepository.findAll();
	}
	
	/**
	 * Get a list of all the constituencies
	 * @return constituencies
	 */
	public List<Constituency> getAllConstituencies()
	{
		return constituencyRepository.findAll();
	}
}
