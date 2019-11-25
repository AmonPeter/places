package com.na.places.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.na.places.entity.Region;

/**
 * Region Repository
 * @author amon
 *
 */
public interface RegionRepository extends JpaRepository<Region, Long> {

}
