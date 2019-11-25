package com.na.places.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

/**
 * Enity for town
 * @author amon
 *
 */
@Data
@Entity
@Table(name = "towns")
public class Town {

	@Id
	@JsonIgnore
	private Long id;
	
	@Column(name = "name")
	private String name;
	
}
