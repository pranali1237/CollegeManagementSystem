package com.edu.CollegeManagement.ServiceImpl;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.edu.CollegeManagement.Entity.Teacher;
import com.edu.CollegeManagement.Exception.ResourceNotFound;
import com.edu.CollegeManagement.Repository.TeacherRepository;
import com.edu.CollegeManagement.Service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService {

	private TeacherRepository teacherRepository;
	
	public TeacherServiceImpl(TeacherRepository teacherRepository) {
		super();
		this.teacherRepository = teacherRepository;
	}

    @Override
	public Teacher saveTeacher(Teacher teacher) {
		return teacherRepository.save(teacher);
	}
    
    @Override
	public List<Teacher> getAllTeacher() {
		return teacherRepository.findAll();
	}

    @Override
	public Teacher getTeacherById(long id) {
		Optional<Teacher> admin = teacherRepository.findById(id);
		if(admin.isPresent()) {
			return admin.get();
		}
		else {
          throw new ResourceNotFound("Teacher","Id",id);
		}
	}

    @Override
	public Teacher updateTeacher(Teacher teacher, long id) {
    	Teacher teach = new Teacher();
	 try {
		   teach = teacherRepository.findById(id).orElseThrow(()->new ResourceNotFound("Teacher","Id",id));
	} catch (ResourceNotFound e) {
		
		e.printStackTrace();
	}
	 teach.setFirstName(teach.getFirstName());
	 teach.setLastName(teach.getLastName());
	 teach.setEmail(teach.getEmail());
	 
	 teacherRepository.save(teach);
	 return teach;
	}
    
    @Override
	public List<Teacher> getTeacherByFirstName(String firstName) {
		return teacherRepository.findByFirstName(firstName);
	}
//
//    @Override
//	public List<Student> getStudentByLastName(String lastName) {
//		return studentRepository.findByLastName(lastName);
//	}
//
//    @Override
//	public List<Student> getStudentByFirstNameAndLastName(String firstName, String lastName) {
//		return studentRepository.findByFirstNameAndLastName(firstName, lastName);
//	}
//    
//    @Override
//	public List<Student> getStudentByFirstNameOrLastName(String firstName, String lastName) {
//		return studentRepository.findByFirstNameOrLastName(firstName, lastName);
//	}
//    
//    @Override
//	public Student getStudentById(Long id) {
//		return studentRepository.findStudentById(id);
//	}
//
//    @Override
//	public Student getStudentFullNameById(long id) {
//		return studentRepository.findStudentFullNameById(id);
//    }
//    
//    @Override
//	public List<Student> getStudentInDescOrder() {
//		return studentRepository.findStudentInDescOrder();
//	}
//
    @Override
	public void deleteTeacher(long id) {    	teacherRepository.findById(id).orElseThrow(()-> new ResourceNotFound("Teacher","id" , id));
	teacherRepository.deleteById(id);
   }
}



