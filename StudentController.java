package com.edu.CollegeManagement.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.edu.CollegeManagement.Entity.Student;
import com.edu.CollegeManagement.Entity.Teacher;
import com.edu.CollegeManagement.Service.TeacherService;

@RestController
@RequestMapping("/api/teacher")
public class StudentController {
	private TeacherService teacherService;

	public StudentController(TeacherService teacherService) 
	{
		super();
		this.teacherService = teacherService;
	}
	
	@PostMapping
	public ResponseEntity<Teacher> saveTeacher(@RequestBody Teacher teacher) 
	{
		return new ResponseEntity<Teacher>(teacherService.saveTeacher(teacher),HttpStatus.CREATED);
	}
	
    @GetMapping
	public List<Teacher> getAllTeacher()
	{
		return teacherService.getAllTeacher();
	}
    
	@GetMapping("{id}")
	public ResponseEntity<Teacher>getTeacherById(@PathVariable("id") long id) 
	{
		return new ResponseEntity<Teacher>(teacherService.getTeacherById(id), HttpStatus.OK);
	}
	
	@GetMapping("/teacherByFirstName/{firstName}")
	public List<Teacher> getTeacherByFirstName(@PathVariable("firstName")String firstName)
	{
	return teacherService.getTeacherByFirstName(firstName);
	}
	
	//@GetMapping("/teacherByLastName/{lastName}")
	//public List<Teacher> getTeacherByLastName(@PathVariable("lastName") String lastName)
	//{
	//	return teacherService.getTeacherByLastName(lastName);
	//}
	
   // @GetMapping("/teacherByFirstNameAndLastName")
	//public List<Teacher> getTeacherByFirstNameAndLastName(@RequestParam("firstName") String firstName, @RequestParam("lastName")  String lastName )
	//{
		//return teacherService.getTeacherByFirstNameAndLastName(firstName, lastName);
	//}
	

//	@GetMapping("/teacherByFirstNameOrLastName")
	//public List<Teacher> getByFirstNameOrLastName(@RequestParam(name="firstName") String firstName, @RequestParam(name="lastName")  String lastName )
	//{
		//return teacherService.getTeacherByFirstNameOrLastName(firstName, lastName);
	//}
//	
//	@GetMapping("/teacherFullNameById/{id}")
//	public STeacher getTeacherFullNameById( @PathVariable("id") long id)
//	{
//		return teacherService.getTeacherFullNameById(id);
//	}
	
	//@PutMapping("{id}")
	//public ResponseEntity<Student> updateStudent(@PathVariable("id") long id, @RequestBody Student student)
	//{
		//return new ResponseEntity<Student>(studentService.updateStudent(student, id),HttpStatus.OK);
	//}
		
	//@GetMapping("/studentInDescOrder")
	//public List<Student> getStudentInDescOrder()
	//{
		//return studentService.getStudentInDescOrder();
	//}

	// CRUD
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteTeacher(@PathVariable("id") long id)
	{
		teacherService.deleteTeacher(id);
		return new ResponseEntity<String>("Teacher record deleted ",HttpStatus.OK);
	}
}	
	



