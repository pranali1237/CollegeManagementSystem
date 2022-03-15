package com.edu.CollegeManagement.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;
@Data
@Entity
@Table(name = "Student_tbl")
public class Student {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name ="student_id")
	private long id;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="email")
	private String email;
	@Column(name="Class")
	private String Class;
	@Column(name="Courses")
	private String Course;
	@Column(name="mobile_no")
	private String mobile_no;
	@Column(name="address")
	private long address;
	
	
	
	
	@Transient
	private int count;
	public Student() {
		
	}
	
	public Student(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public long getAddress() {
		return address;
	}

	public void setAddress(long address) {
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

    public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

    public String getLastName() {
		return lastName;
	}

    public void setLastName(String lastName) {
		this.lastName = lastName;
	}
    
    /*public student(Long id, String email) {
		super();
		this.id = id;
		this.email = email;
	}*/
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public 
	Student(long id, String mobile_no) {
		super();
		this.id = id;
		this.mobile_no = mobile_no;          
	}
	
	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	} 
}     



