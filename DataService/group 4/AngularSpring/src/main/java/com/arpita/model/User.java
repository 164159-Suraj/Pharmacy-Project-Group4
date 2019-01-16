package com.arpita.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="userdata")
public class User {
@Id	
String id;
String name;
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", getId()=" + getId() + ", getName()=" + getName() + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
public User() {
	
}
public User(String id, String name) {

	this.id = id;
	this.name = name;
}





public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
