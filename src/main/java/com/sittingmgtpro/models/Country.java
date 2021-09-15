package com.sittingmgtpro.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="country")
public class Country {
	
	@Id
	@GeneratedValue
	@Column(name="country_id")
	private int countryId;
	
	@Column(name="country_name")
	private String countryName;

}
