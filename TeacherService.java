package com.edu.CollegeManagement.Service;


import java.util.List;

import com.edu.CollegeManagement.Entity.Student;
import com.edu.CollegeManagement.Entity.Teacher;

public interface TeacherService {

	Teacher saveTeacher(Teacher teacher);
	s
    List<Teacher> getAllTeacher();

    Teacher getTeacherById(long id);

    Teacher updateTeacher(Teacher teacher, long id);


//	List<Student> getStudentByLastName(String lastName);
//
//	List<Student> getStudentByFirstNameAndLastName(String firstName, String lastName);
//
//	List<Student> getStudentByFirstNameOrLastName(String firstName, String lastName);
//
//	Student getStudentById(Long id);
//
//	Student getStudentFullNameById(long id);
//
//	List<Student> getStudentInDescOrder();

	void deleteTeacher(long id);

	List<Teacher> getTeacherByFirstName(String firstName);

	Student saveStudent(Student student);


    
}

	

	
