package jpa.entitymodels;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student_course")
public class StudentCourse implements Serializable {
	private static final long serialVersionUID = 1L;
		@Id
	private String sEmail;
		@Id
	private int cId;
		public String getsEmail() {
			return sEmail;
		}
		public void setsEmail(String sEmail) {
			this.sEmail = sEmail;
		}
		public int getcId() {
			return cId;
		}
		public void setcId(int cId) {
			this.cId = cId;
		}
		@Override
		public int hashCode() {
			return Objects.hash(cId, sEmail);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			StudentCourse other = (StudentCourse) obj;
			return cId == other.cId && Objects.equals(sEmail, other.sEmail);
		}

	
	
	
	
	
}
