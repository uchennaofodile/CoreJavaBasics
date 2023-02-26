package jpa.entitymodels;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column( nullable=false, length=50, name= "email")
private String sEmail;
	@Column(nullable=false, length=50, name ="name")
private String sName;
	@Column(nullable=false, length=50, name= "password")
private String sPass;

public Student(String sEmail, String sName, String sPass, List<Course> sCourses ) {
	this.sEmail = sEmail;
	this.sName = sName;
	this.sPass = sPass;
	this.sCourses = new ArrayList<>();
}

public Student() {}


@ManyToMany(cascade = {CascadeType.ALL})
@JoinTable(
		name = "student_course",
		joinColumns = {@JoinColumn(name= "sEmail")},
		inverseJoinColumns = {@JoinColumn(name = "cId")}
		)
private List<Course> sCourses = new ArrayList<>();

public String getsEmail() {
	return sEmail;
}

public void setsEmail(String sEmail) {
	this.sEmail = sEmail;
}

public String getsName() {
	return sName;
}

public void setsName(String sName) {
	this.sName = sName;
}

public String getsPass() {
	return sPass;
}

public void setsPass(String sPass) {
	this.sPass = sPass;
}

public List<Course> getsCourses() {
	return sCourses;
}

public void setsCourses(List<Course> sCourses) {
	this.sCourses = sCourses;
}

@Override
public String toString() {
	return "Student [sEmail=" + sEmail + ", sName=" + sName + ", sPass=" + sPass + ", sCourses=" + sCourses + "]";
}

@Override
public int hashCode() {
	return Objects.hash(sCourses, sEmail, sName, sPass);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	return Objects.equals(sCourses, other.sCourses) && Objects.equals(sEmail, other.sEmail)
			&& Objects.equals(sName, other.sName) && Objects.equals(sPass, other.sPass);
}





}
