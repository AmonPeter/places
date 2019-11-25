package com.na.places.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

/**
 * Entity for constituency
 * @author amon
 *
 */
@Data
@Entity
@Table(name = "constituencies")
public class Constituency {
	
	@Id
	@JsonIgnore
	private Long id;
	
	@Column(name = "name")
	private String name;

}
