package com.example.firstrestservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.firstrestservice.entity.StudentEntity;


@Repository
public interface StudentInterface extends JpaRepository<StudentEntity, String>{
 public List<StudentEntity> findByName(String name);
 public List<StudentEntity> findByUsername(String username);
 public StudentEntity findByUsernameAndPhonenumber(String username,String phonenumber);
 
 
 
@Query(nativeQuery=true,value="select sid,username,dob,salary from stud1")
public List<String> firstNativeQuery();

@Query(nativeQuery=true,value="select sid,username,dob,salary from stud1 where sid=:sid")
public List<String> nativeQuery(String sid);
}
