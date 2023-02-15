package com.perscholas.model;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table
public class Teacher implements Serializable  {
//	private static final long serialVersionUID = 1L;
//	@Id
//	@GeneratedValue( strategy=GenerationType.IDENTITY )
//	private int tid;
//	private String salary;
//	private String Teachername;
//	
//	@ManyToOne
//	private Department department; //constraint tid_fk foreign key references Department(did)
//	public Teacher(int tid, String salary, String teachername) {
//		super();
//		this.tid = tid;
//		this.salary = salary;
//		Teachername = teachername;
//	}
//	public Teacher()
//	{}
//	
//	public Department getDep() {
//		return department;
//	}
//	public void setDep(Department department) {
//		this.department = department;
//	}
//	public int gettid() {
//		return tid;
//	}
//	public void settid(int tid) {
//		this.tid = tid;
//	}
//	public String getSalary() {
//		return salary;
//	}
//	public void setSalary(String salary) {
//		this.salary = salary;
//	}
//	public String getTeachername() {
//		return Teachername;
//	}
//	public void setTeachername(String teachername) {
//		Teachername = teachername;
		
		//begin many-to-many teacher
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY )
	private int tid;
	private String salary;
	private String Teachername;
	
	 @ManyToMany(targetEntity = Cohort.class)
	 private Set <Cohort>CohortSet;
	public Teacher(String salary, String teachername, Set<Cohort> CohortSet) {
	this.salary = salary;
	this.Teachername = teachername;
	this.CohortSet = CohortSet;
		
	}
	public Teacher() {
		super();
	}
	
	public Set<Cohort> getCohortSet() {
		return CohortSet;
	}
	public void setCohortSet(Set<Cohort> cohortSet) {
		this.CohortSet = cohortSet;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getTeachername() {
		return Teachername;
	}
	public void setTeachername(String teachername) {
		this.Teachername = teachername;
	}

	}	


