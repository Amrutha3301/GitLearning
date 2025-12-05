package p3;

import java.io.IOException;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class StudentReport extends SimpleTagSupport {
	@Override
	public void doTag() throws JspException, IOException {
	JspWriter out=getJspContext().getOut();
	try {
		StudentDao s=new StudentDao();
		List<StudentDto> l1=s.getallstudent();
		out.print("<h1>All Student list</h1>");
		out.print("<table border='1'>");
		out.print("<tr><th>Student rollno</th>");
		out.print("<th>Student FirstName</th>");
		out.print("<th>Student LastName</th>");
		out.print("<th>Student DOB</th>");
		out.print("<th>Student Gender</th></tr>");
		for(int i=0;i<l1.size();i++) {
			out.print("<tr><td>"+l1.get(i).getSroll() +"</td>");
			out.print("<td>"+l1.get(i).getFirstname() +"</td>");
			out.print("<td>"+l1.get(i).getLname() +"</td>");
			out.print("<td>"+l1.get(i).getDob() +"</td>");
			out.print("<td>"+l1.get(i).getGender() +"</td></tr>");
		}
		out.print("</table>"); 
	} catch (Exception e) {
		out.print(e.getMessage());
	}
	}

}
