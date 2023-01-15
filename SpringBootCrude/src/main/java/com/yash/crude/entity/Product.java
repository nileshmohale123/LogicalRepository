package com.yash.crude.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 * @author nilesh.mohale
 *
 */
@Entity // This tells Hibernate to make a table out of this class
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String prize;
	private String quntity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrize() {
		return prize;
	}
	public void setPrize(String prize) {
		this.prize = prize;
	}
	public String getQuntity() {
		return quntity;
	}
	public void setQuntity(String quntity) {
		this.quntity = quntity;
	}
	
	
	
}
