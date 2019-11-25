package com.na.places.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.na.places.entity.Town;

/**
 * Town repository
 * @author amon
 *
 */
public interface TownRepository extends JpaRepository<Town, Long> {

}
