package com.edu.CollegeManagement.ServiceImpl;



import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.edu.CollegeManagement.Entity.Student;
import com.edu.CollegeManagement.Entity.Teacher;
import com.edu.CollegeManagement.Exception.ResourceNotFound;
import com.edu.CollegeManagement.Repository.StudentRepository;
import com.edu.CollegeManagement.Service.TeacherService;

@Service
public class StudentServiceImpl implements TeacherService {

	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

    @Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}
    
    @Override
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}

    @Override
	public Student getStudentById(long id) {
		Optional<Teacher> admin = studentRepository.findById(id);
		if(admin.isPresent()) {
			return admin.get();
		}
		else {
          throw new ResourceNotFound("Teacher","Id",id);
		}
	}

    @Override
	public Student updateStudent(Student student, long id) {
    	Student stud = new Student();
	 try {
		   stud = studentRepository.findById(id).orElseThrow(()->new ResourceNotFound("Student","Id",id));
	} catch (ResourceNotFound e) {
		
		e.printStackTrace();
	}
	 stud.setFirstName(stud.getFirstName());
	 stud.setLastName(stud.getLastName());
	 stud.setEmail(stud.getEmail());
	 
	 studentRepository.save(stud);
	 return stud;
	}
    
    @Override
	public List<Student> getStudentByFirstName(String firstName) {
		return studentRepository.findByFirstName(firstName);
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
	public void deleteStudent(long id) {    	studentRepository.findById(id).orElseThrow(()-> new ResourceNotFound("Student","id" , id));
	studentRepository.deleteById(id);
   }

@Override
public Student saveStudent(Student student) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Student getStudentById(long id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Teacher updateTeacher(Teacher teacher, long id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Teacher saveTeacher(Teacher teacher) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<Teacher> getAllTeacher() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Teacher getTeacherById(long id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void deleteTeacher(long id) {
	// TODO Auto-generated method stub
	
}

@Override
public List<Teacher> getTeacherByFirstName(String firstName) {
	// TODO Auto-generated method stub
	return null;
}
}



