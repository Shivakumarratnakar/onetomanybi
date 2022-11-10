package com.ty.onetomanyDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Sim {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String company;
private String type;
private Phone phone;

public Phone getPhone() {
	return phone;
}
public void setPhone(Phone phone) {
	this.phone = phone;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
@Override
public String toString() {
	return "Sim [id=" + id + ", company=" + company + ", type=" + type + "]";
}

}
