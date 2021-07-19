package com.application.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "UserRegistration")
public class User implements Serializable
{
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO )
    private int id;
    
    @JsonProperty(value ="name")
    @Column(name ="Name")
    private String name;
    
    @JsonProperty(value ="emailid")
    @Column(name ="Email_id")
    private String emailid;
    
    @JsonProperty(value ="address")
    @Column(name ="Address")
    private String address;
    
    @JsonProperty(value ="place")
    @Column(name ="Place")
    private String place;
    
    @JsonProperty(value ="role")
    @Column(name ="Role")
    private String role;
    
    @JsonProperty(value ="password")
    @Column(name ="Password")
    private String password;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

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

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public User(int id, String name, String emailid, String address, String place) {
		super();
		this.id = id;
		this.name = name;
		this.emailid = emailid;
		this.address = address;
		this.place = place;
		this.role=role;
		this.password=password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", emailid=" + emailid + ", address=" + address + ", place="
				+ place + ", role=" + role + ", password=" + password + "]";
	}

        
}