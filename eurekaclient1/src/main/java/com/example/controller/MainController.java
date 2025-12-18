package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;

@RestController
@RequestMapping("/eclient1")
@CrossOrigin
/**
 * * This is a eureka client main
 */
public class MainController {
	@Autowired
	StudentDao dao;
	/**
	 * * This is a test method which will return a string
	 */
	 @Operation(summary = "Test endpoint", description = "This method returns a test string for Eureka client1")
@GetMapping("/test")
public String f1() {
	return "Welcome to eureka";
}
@GetMapping("/liststudent")
public List<StudentEntity> findAll(){
	return dao.findAll();
}
}
