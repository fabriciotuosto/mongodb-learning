package org.mongodb.learn;

import org.codehaus.jackson.annotate.JsonProperty;

public class Person{
	enum Sex{
		MALE,FEMALE;
	}
	@JsonProperty("_id")
	private String id;
	private String name;
	private String dni;
	private Sex sex;
	
	public Sex getSex() {
		return sex;
	}
	public void setSex(Sex sex) {
		this.sex = sex;
	}
	public String getId() {
		return id;
	}
	public void setId(String _id) {
		this.id = _id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
}
