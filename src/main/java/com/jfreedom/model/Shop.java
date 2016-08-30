package com.jfreedom.model;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@NamedQuery(name = "Shop.searchname", query = "SELECT p FROM Shop p WHERE LOWER(p.name) = LOWER(?1)")
@Table(name ="tb_shop")
public class Shop implements Serializable{
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="local")
	private String local;
	
	@Column(name="email")
	private String email;
	
	
	
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



	public String getLocal() {
		return local;
	}



	public void setLocal(String local) {
		this.local = local;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}

	

	
	public Shop() {
	
	}
	
	@Override
	 public String toString() {
	        return "Shop id=" + id + ", name =" + name + "email=" + email;
	                
	    }
}
