package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class,property = "@id",scope = Item.class)

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Item {
	 	
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int itemId;
		private String itemName;
	    private String category;
	    private String description;
	    
	    public Item(String itemName, String category, String description) {
			super();
			this.itemName = itemName;
			this.category = category;
			this.description = description;
		}

}
