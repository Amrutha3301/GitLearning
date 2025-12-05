package p3;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class StudentController
 */
//@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rx = request.getRequestDispatcher("liststudent.jsp");
		try {
			StudentDao ob1=new StudentDao();
	        
			request.setAttribute("addkey", ob1.getallstudent());
			rx.forward(request, response);
		} catch (Exception e) {
			request.setAttribute("msg",e.getMessage());
			rx.forward(request, response);
		
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rx = request.getRequestDispatcher("student.jsp");
		try {
			StudentDto ob=new StudentDto();
			ob.setSroll(Integer.parseInt(request.getParameter("a1")));
			ob.setFirstname(request.getParameter("a2"));
			ob.setLname(request.getParameter("a3"));
			ob.setDob((new SimpleDateFormat("yyyy-MM-dd")).parse(request.getParameter("a4")));
             ob.setGender(request.getParameter("a5"));
             StudentDao ob2=new StudentDao();
             ob2.editstudent(ob);
             request.setAttribute("msg","Record Updated");
 			rx.forward(request, response);
		} catch (Exception e) {
			request.setAttribute("msg",e.getMessage());
			rx.forward(request, response);
		}
	}

}
