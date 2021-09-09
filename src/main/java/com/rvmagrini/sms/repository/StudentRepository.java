package com.rvmagrini.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rvmagrini.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
