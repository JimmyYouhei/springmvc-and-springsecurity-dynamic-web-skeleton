package com.jimmyyouhei.springmvc_and_springsecurity.entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {
	
	@NotBlank(message = "Name cannot be null")
	@Size(min = 1 , message = "Name must be at least 1 char")
	@Pattern(regexp = "[^0-9]+" , message = "Name cannot contain number" )
	private String fullName;
	
	@NotNull(message = "Age cannot be null")
	@Min(value = 19 , message = "must be more than 18 or less than 40")
	@Max(value = 39 , message = "must be more than 18 or less than 40")
	private Integer age;
	
	@NotNull(message = "Please choose ")
	@Size(min = 1 , message = "Please choose ")
	private String nation;
	
	@NotNull(message = "Please choose at least a course")
	@Size(min = 1 , message = "Please choose at least a course")
	private String[] courses;
	
	@NotNull(message = "Please properly choose at least a languae")
	@Size(min = 1 , message = "Please properly choose at least a language")
	private String[] languages;
	
	public Student() {
		
	}

	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String[] getCourses() {
		return courses;
	}
	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	public String[] getLanguages() {
		return languages;
	}
	public void setLanguages(String[] languages) {
		this.languages = languages;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String printCourses() {
		
		StringBuilder sb = new StringBuilder();
		
		for (String string : courses) {
			sb.append(string);
			sb.append(" , ");
		}
		
		sb.setLength(sb.length()-2);
	
		return sb.toString();
		
	}
	
	public String printLanguages() {
		
		StringBuilder sb = new StringBuilder();
		
		for (String string : languages) {
			sb.append(string);
			sb.append(" , ");
		}
		
		sb.setLength(sb.length()-2);
	
		return sb.toString();
		
	}

}
