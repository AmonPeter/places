package com.na.places.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.na.places.entity.Constituency;

/**
 * Constituency repository
 * @author amon
 *
 */
public interface ConstituencyRepository extends JpaRepository<Constituency, Long> {

}
