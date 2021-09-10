package com.rvmagrini.sms.service;

import java.util.List;

import com.rvmagrini.sms.entity.Student;

//SERVICE LAYER/CLASS:
//- mainly responsible for business logic
//- talks to the API layer and the Data Access Layer

public interface StudentService {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student editStudent(Student student);
	
	void deleStudentById(Long id);

}
