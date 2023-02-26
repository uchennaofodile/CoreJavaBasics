package jpa.entitymodels;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Course")
public class Course implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
private int cId;
	@Column(nullable=false , length=50, name="name")
private String cName;
	@Column(nullable=false, length=50, name="instructor")
private String cInstructor;

public Course(int cId, String cName, String cInstructor) {
	this.cId=cId;
	this.cName =cName;
	this.cInstructor =cInstructor;
}

public Course() {}

@ManyToMany(mappedBy = "sCourses")
private List<Student> students = new ArrayList<>();

public int getcId() {
	return cId;
}

public void setcId(int cId) {
	this.cId = cId;
}

public String getcName() {
	return cName;
}

public void setcName(String cName) {
	this.cName = cName;
}

public String getcInstructor() {
	return cInstructor;
}

public void setcInstructor(String cInstructor) {
	this.cInstructor = cInstructor;
}

@Override
public String toString() {
	return "Course [cId=" + cId + ", cName=" + cName + ", cInstructor=" + cInstructor + "]";
}

@Override
public int hashCode() {
	return Objects.hash(cId, cInstructor, cName, students);
}

@Override
public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
        return false;
    }
    Course course = (Course) obj;
    return cId == course.cId &&
            Objects.equals(cName, course.cName) &&
            Objects.equals(cInstructor, course.cInstructor);
}



}
