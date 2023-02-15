package com.test.hib.model;
import jakarta.persistence.*;

@Entity
@Table(name = "DEPARTMENT")
public class Department {
	@Column(name = "DEPARTMENT_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// not null auto_increment
private int department_id;
private String name;
private String state;


public Department( String name, String state ) {
	this.name = name;
	this.state = state;
}
public Department() {
}

public int getDepartment_id() {
	return this.department_id;
} 

public void setDepartment_id(int department_id) {
	this.department_id = department_id;
} 

public String getName() {
	return this.name;
}

public void setName(String name) {
	this.name = name;
}

public String getState() {
	return this.state;
}

public void setState(String state) {
	this.state = state;
}

}
