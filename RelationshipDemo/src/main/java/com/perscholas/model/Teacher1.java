package com.perscholas.model;
import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table
public class Teacher1 implements Serializable  {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY )
	private int tid;
	private String salary;
	private String Teacher1name;
//     @ManyToOne
//	private Department1 department1;
	public Teacher1(int tid, String salary, String Teacher1name) {
		super();
		this.tid = tid;
		this.salary = salary;
		Teacher1name = Teacher1name;
	}
	public Teacher1()
	{}
		
	public int gettid() {
		return tid;
	}
	public void settid(int tid) {
		this.tid = tid;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getTeacher1name() {
		return Teacher1name;
	}
	public void setTeacher1name(String Teacher1name) {
		Teacher1name = Teacher1name;
	}	
}
