package com.rvmagrini.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rvmagrini.sms.entity.Student;
import com.rvmagrini.sms.repository.StudentRepository;
import com.rvmagrini.sms.service.StudentService;


//* Dependency Injection *
//Component or SERVICE annotation: defines that this class has to be instantiate = it has to be a SPRING BEAN
@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}



}
