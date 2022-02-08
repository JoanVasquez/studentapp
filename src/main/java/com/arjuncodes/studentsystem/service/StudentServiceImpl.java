package com.arjuncodes.studentsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arjuncodes.studentsystem.model.Student;
import com.arjuncodes.studentsystem.repository.IStudentRepository;

@Service
public class StudentServiceImpl implements IStudentService{
	
	@Autowired
	private IStudentRepository iStudentRepository;

	@Override
	public Student saveStudent(Student student) {
		return iStudentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		return iStudentRepository.findAll();
	}

}
