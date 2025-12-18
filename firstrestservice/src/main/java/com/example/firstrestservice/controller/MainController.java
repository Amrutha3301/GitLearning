package com.example.firstrestservice.controller;

import java.util.List;
import java.util.Optional;

import org.hibernate.sql.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.firstrestservice.dao.StudentInterface;
import com.example.firstrestservice.entity.StudentEntity;
import com.example.firstrestservice.service.UserService;

import jakarta.validation.Valid;
@RequestMapping("/m1")
@RestController
@CrossOrigin
public class MainController {
	@Autowired
	UserService service;
	@Autowired
    StudentInterface stud;
	@Autowired
	RestTemplate template;
	@GetMapping("/")
	public ResponseEntity<String> f1(){
		return new ResponseEntity<String>("welcome to controller",HttpStatus.OK);
	}
	@GetMapping("/m1")
	public String f2() {
		return "<h1>Inside the other mapping<h1>";
	}
	@GetMapping("/allstudents")
	public ResponseEntity<List<StudentEntity>> f3(){
		List<StudentEntity> std=stud.findAll();
		if(std==null) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}else {
			return new ResponseEntity<List<StudentEntity>>(std, HttpStatus.OK);
		}
		
		
	}
	@GetMapping("/byid/{id}")
	public Optional<StudentEntity> f4(@PathVariable("id") String id){
		return stud.findById(id);
	}
	@GetMapping("/byname/{name}")
	public List<StudentEntity> f5(@PathVariable("name") String name){
		return stud.findByName(name);
	}
	@PostMapping("/useradd")
	public ResponseEntity<String> f6(@Valid @RequestBody StudentEntity std) throws Exception{
		return ResponseEntity.ok(service.addUser(std));
	}
	   @GetMapping("/name/{name}")
	    public ResponseEntity<List<StudentEntity>>f7(@PathVariable("name") String name) {
	        List<StudentEntity> students = service.getStudentsByName(name);
	        if (students.isEmpty()) {
	            return ResponseEntity.notFound().build();
	        }
	        return ResponseEntity.ok(students);
	    }
	   
	    @DeleteMapping("/{id}")
	    public ResponseEntity<String> deleteStudent(@PathVariable("id") String id) {
	        try {
	            String result = service.deleteStudent(id);
	            return ResponseEntity.ok(result);
	        } catch (Exception e) {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
	        }
	    }
	    @GetMapping("/students")
	    public String f12(){
	    	return template.getForObject("https://localhost:9095/mail/test",String.class);
	    }
}
