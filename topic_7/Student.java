package topic_7;



import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue
	@Column(name="reg_number", nullable = false)
	private int regNumber;
	@Column(name="first_name", nullable = false)
	private String first_name;
	@Column(name="last_name", nullable = false)
	private String last_name;
	@Column(name="birth", nullable = false)
	private Date birth;
		
	public Student() {}

	public Student(String first_name, String last_name, Date birth) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.birth = birth;
	}

	public int getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(int reg_number) {
		this.regNumber = reg_number;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "Student [reg_number=" + regNumber + ", first_name="
				+ first_name + ", last_name=" + last_name + ", birth=" + birth
				+ "]";
	}
	
}
