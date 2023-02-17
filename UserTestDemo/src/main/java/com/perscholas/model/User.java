package com.perscholas.model;

import java.io.Serializable;
import java.util.Objects;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Practice NamedQueries - not used
@NamedQueries({
	@NamedQuery(name="find_By_Email", query="from User WHERE email = :email"),
	@NamedQuery(name="find_Users_By_Zip", query= "from User WHERE zipcode = :zipcode")
	
})

@Entity
@Table(name="Users")
public class User implements Serializable {
	@Column(name="Id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int userId;
	@Column(unique=true)
private String email;
private String name;
private String password;
private String address;
private String state;
private String zipcode;


public User( String email, String name, String password, String address, String state, String zipcode) {
	super();
	this.email = email;
	this.name = name;
	this.password = password;
	this.address = address;
	this.state = state;
	this.zipcode = zipcode;
}

public User() {}

public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getZipcode() {
	return zipcode;
}
public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
}
@Override
public String toString() {
	return /*"User [userId=" + userId +*/ "Email=" + email + ", name=" + name + ", password=" + password + ", address="
			+ address + ", state=" + state + ", zipcode=" + zipcode + "]";
}



@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((address == null) ? 0 : address.hashCode());
	result = prime * result + ((email == null) ? 0 : email.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((password == null) ? 0 : password.hashCode());
	result = prime * result + ((state == null) ? 0 : state.hashCode());
	result = prime * result + userId;
	result = prime * result + ((zipcode == null) ? 0 : zipcode.hashCode());
	return result;
}



@Override
public boolean equals(Object o) {
	if (this.toString().equals(o.toString())) {
		return true;
	}
	if (o instanceof User) {
		User other = (User) o;
		boolean sameId =(this.userId==other.getUserId());
		boolean sameEmail=(this.email==other.getEmail());
		boolean sameName=(this.name==other.getName());
		boolean samePassword=(this.password==other.getPassword());
		boolean sameAddress=(this.address==other.getAddress());
		boolean sameState=(this.state==other.getState());
		boolean sameZip=(this.zipcode==other.getZipcode());
		if(sameId && sameEmail && sameName && samePassword && sameAddress && sameState && sameZip)
			return true;
	}
	return false;
}




}
