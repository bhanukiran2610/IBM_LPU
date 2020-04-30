package com.example.demo.model;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class,property = "@id",scope = Item.class)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Item {
	 	
		private String itemName;
	    private String category;
	    private String description;

}
