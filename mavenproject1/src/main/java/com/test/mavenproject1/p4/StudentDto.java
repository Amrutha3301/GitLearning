package com.test.mavenproject1.p4;

public class StudentDto {
 private int sid;
 private String sname;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public StudentDto(int sid, String sname) {
	super();
	this.sid = sid;
	this.sname = sname;
}
@Override
public String toString() {
	return "StudentDto [sid=" + sid + ", sname=" + sname + "]";
	
}
}