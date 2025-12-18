package com.example.firstrestservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.firstrestservice.dao.StudentInterface;
import com.example.firstrestservice.entity.StudentEntity;

@Service
public class UserService {
@Autowired
StudentInterface dao;
@Value("${err1}")
String s1;
public String addUser(StudentEntity ob) throws Exception {
	if(dao.findById(ob.getSid()).isPresent()) {
		throw new Exception("User already exists");
	}
	
   dao.save(ob);
	return s1;
}
public List<StudentEntity> getStudentsByName(String name) {
    return dao.findByName(name);
}

public String deleteStudent(String sid) throws Exception {
    if (!dao.existsById(sid)) {
        throw new Exception("Student not found");
    }
    dao.deleteById(sid);
    return "Student deleted successfully with ID: " + sid;
}
}
