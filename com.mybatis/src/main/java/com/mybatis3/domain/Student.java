package com.mybatis3.domain;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
	
	private Integer studId;
	private String name;
	private String email;
	private Date dob;
	
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", name=" + name + ", email=" + email + ", dob=" + dob + "]";
	}
	
}
