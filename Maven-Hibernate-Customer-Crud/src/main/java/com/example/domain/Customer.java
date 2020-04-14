package com.example.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Data

@Table(name="customer")
public class Customer implements Serializable {
	
	private static final long serialVersionUID=-7209693288444782024L;
	
	@Id
	private String customerId;
	
	@Column(name="name")
	private String customerName;
	
	@Column(name = "email")
	private String customerEmail;
	
	@Column(name="isActive")
	private boolean isActive;
	
	
	

}
