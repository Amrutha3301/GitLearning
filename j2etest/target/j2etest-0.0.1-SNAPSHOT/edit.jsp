<%@page import="p3.StudentDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
StudentDto ob=new StudentDto();
ob.setSroll(Integer.parseInt(request.getParameter("a1")));
ob.setFirstname(request.getParameter("a2"));
ob.setLname(request.getParameter("a3"));

%>
<div>
<h1>Edit Student</h1>
</div>
<div>
<table border='1'>
<form action ='StudentController' method='post'>
<tr>
<td>Student Id</td>
<td><input type='text' name='a1' value='<%=ob.getSroll()%>' readonly/><td>
</tr>
<tr>
<td>FirstName</td>
<td><input type='text' name='a2' value='<%=ob.getFirstname()%>'/><td>
</tr>
<tr>
<td>LastName </td>
<td><input type='text' name='a3' value='<%=ob.getLname()%>'/><td>
</tr>
<tr>
<td>DOB</td>
<td><input type='date' name='a4' value='<%=ob.getDob()%>'/><td>
</tr>
<td>Gender</td>
<td><input type='radio' name='a5' value='m'/>Male<input type='radio' name='a5' value='f'/>Female</td>
</tr>
<tr>
<td></td>
<td><input type='hidden' name='a6' value='2'/><td>
</tr>
<tr>
<td><input type='submit' value='Edit'/><td>
</tr>
</form>
</table>
</div>
</body>
</html>