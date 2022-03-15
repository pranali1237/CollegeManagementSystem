package com.edu.CollegeManagement.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.edu.CollegeManagement.Entity.Student;

public interface StudentRepository extends JpaRepository <Student, Long> {

	List<Student> findByFirstName(String firstName);
	

//
//	List<Teacher> findByLastName(String lastName);
//
//	@Query("select s from Student s where s.firstName =:name ")//JPQL
//    List<Student> findStudentByFirstName(@Param("name") String firstName);
//
//    @Query("select s from Student s where s.firstName =:firstName and .lastName =:lastName")
//	List<Student> findStudentsByFirstNameAndLastName(@Param("firstName")String firstName, @Param("lastName")String lastName);
//	
//	List<Student> findByFirstNameOrLastName(String firstName, String lastName);
//	List<Student> findByFirstNameAndLastName(String firstName, String lastName);
//
//    
//    @Query("Select new com.edu.CollegeManagement.Entity.Student(s.firstName, s.lastName) from Student s where s.id = :id") // Using
//	// Constructor
//     Student findStudentFullNameById(@Param("id") long id);
//
//    @Query("select count(s.id)  from Student s ORDER BY s.firstName desc")
//    List<Student> findStudentInDescOrder();
//
//	//Student findStudentById(Long id);
//
//	Student findStudentById(Long id);


// CRUD
}
