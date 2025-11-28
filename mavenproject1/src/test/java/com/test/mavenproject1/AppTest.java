package com.test.mavenproject1;

import org.junit.jupiter.api.Test;              // ✅ Correct import
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.test.mavenproject1.p5.DbConnect;
import com.test.mavenproject1.p5.StudentDao;
import com.test.mavenproject1.p5.StudentDto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.sql.Connection;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testcase1() {
        assertTrue(true);   // ✅ simple assertion
    }
    @Test
    public void dbconnect() {
    	try {
    		Connection con =DbConnect.getConnection();
		} catch (Exception e) {
			fail();
		}
    	
    }
    @Test
    public void dbtest2() {
    	try {
			List<StudentDto> l1= new StudentDao().getAllStudent();
		} catch (Exception e) {
			fail();
			
		}
    }
    @Test
    public void dbtest3() {
    	try {
			List<StudentDto> l1= new StudentDao().getAllStudent();
			if(l1.size()<0)fail();
		} catch (Exception e) {
			fail();
			
		}
    }
    @Test
    public void dbtest4(){
    	try {
			StudentDto ob1=new StudentDto();
			ob1.setSroll(1006);
			StudentDto ob=new StudentDao().getbyid(ob1);
			
		} catch (Exception e) {
			fail();
			
		}
    }
    @ParameterizedTest
    @ValueSource(ints= {1001,1002,1003,1004,1005,1006,1007,1008,1009,1010,1012,1013})
    public void dbtest5(int x){
    	try {
			StudentDto ob1=new StudentDto();
			ob1.setSroll(x);
			StudentDto ob=new StudentDao().getbyid(ob1);
		
		} catch (Exception e) {
			fail();
			
		}
    }
    @ParameterizedTest
    @ValueSource(ints= {1001,1002,1003})
    public void dbtest6(int x){
    	try {
			StudentDto ob1=new StudentDto();
			ob1.setSroll(x);
			StudentDto ob=new StudentDao().getbyid(ob1);
			assertEquals("Aria",ob.getFirstname());
			fail();
		} catch (Exception e) {
//			fail();
//			
		}
    }
}
