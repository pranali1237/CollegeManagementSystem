package com.edu.CollegeManagement.Service;

import java.util.List;

import com.edu.CollegeManagement.Entity.Student;

public interface StudentService {

	Student saveStudent(Student student);
	
    List<Student> getAllStudent();

	Student getStudentById(long id);

	Student updateStudent(Student student, long id);

	void deleteStudent(long id);

	List<Student> getStudentByFirstName(String firstName);

}

	

	