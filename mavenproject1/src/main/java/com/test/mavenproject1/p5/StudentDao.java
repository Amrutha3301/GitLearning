package com.test.mavenproject1.p5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class StudentDao {
	//private ResultSet performquery(S)
	public List<StudentDto> getAllStudent() throws Exception {
		Connection con =DbConnect.getConnection();
		PreparedStatement ps=con.prepareStatement("Select* from Student");
		ResultSet rs = ps.executeQuery(); // RS is cursor which points the data here it is pointing to beginning of file
		List<StudentDto> l1 =new ArrayList<StudentDto>();
		ResultSetMetaData rm = (ResultSetMetaData) rs.getMetaData();
		System.out.println(rm.getColumnCount());
		int c =rm.getColumnCount();
		for(int i=1;i<=c;i++) {
			System.out.println(rm.getCatalogName(i)+" "+rm.getColumnType(i));
		}
		while(rs.next()) {
			l1.add(new StudentDto(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDate(4),rs.getString(5)));
		}
		return l1;
	}
	
	public StudentDto getbyid(StudentDto ob) throws Exception {
		Connection con =DbConnect.getConnection();
		PreparedStatement ps=con.prepareStatement("Select* from Student where sroll=?");
		ps.setInt(1, ob.getSroll());
		ResultSet rs = ps.executeQuery(); 
		if(rs.next()) {
			ob.setFirstname(rs.getString(2));
			ob.setLname(rs.getString(3));
			ob.setDob(rs.getDate(4));
			ob.setGender(rs.getString(5));
			
		}else {
			throw new Exception("sroll" +ob.getSroll()+ "does not exist");
		}
		
		return ob;
		
	}
	
	
	public StudentDto insert(StudentDto ob) throws Exception {
		Connection con =DbConnect.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into Student (sroll,firstname,lname,dob,gender) values(?,?,?,?,?)");
		ps.setInt(1,ob.getSroll());
		ps.setString(2, ob.getFirstname());
		ps.setString(3, ob.getLname());
		ps.setDate(4, ob.getDob());
		ps.setString(5,ob.getGender());
		
		 int rs = ps.executeUpdate();   // perform the insert dml operations need executeUpdate
		    
		return ob;
		
	}
	
	public StudentDto delete(StudentDto ob) throws Exception {
		Connection con =DbConnect.getConnection();
		PreparedStatement ps=con.prepareStatement("delete from student where sroll=?");
		ps.setInt(1,ob.getSroll());
		int rs = ps.executeUpdate();
		
      return ob;
}
}
