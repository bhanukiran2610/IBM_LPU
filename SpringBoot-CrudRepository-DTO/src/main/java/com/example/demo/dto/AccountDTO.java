package com.example.demo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ApiModel(description = "Api Model for Dto Account")
@AllArgsConstructor
@ToString
@Getter
@Setter
public class AccountDTO {
	
	
	@ApiModelProperty(notes="Account Type Field")
	private String accountType;
	
	@ApiModelProperty(notes="Account Balance Field")
	private double balance;
}
