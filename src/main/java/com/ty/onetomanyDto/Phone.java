package com.ty.onetomanyDto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Phone {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String model;
private int storage;
private String colour;
@OneToMany
private List<Sim>sim;

public List<Sim> getSim() {
	return sim;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getStorage() {
	return storage;
}
public void setStorage(int storage) {
	this.storage = storage;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
@Override
public String toString() {
	return "Phone [id=" + id + ", model=" + model + ", storage=" + storage + ", colour=" + colour + "]";
}
public void setSim(List<Sim> sim) {
	
	
}
}
