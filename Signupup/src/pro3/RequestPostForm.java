package pro3;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class RequestPostForm
 */
@WebServlet("/RequestPostForm")
public class RequestPostForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestPostForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("user_name");
		String email = request.getParameter("user_email");
		String password = request.getParameter("user_password");
		String age = request.getParameter("user_age");
		String bio = request.getParameter("user_bio");
		String job = request.getParameter("user_job");
		
		String[] interest = request.getParameterValues("user_interest");
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(password);
		System.out.println(age);
		System.out.println(bio);
		System.out.println(job);
		
		for(String ints : interest) {
			
			System.out.println(ints);
		}
		
		List<String> interest1 = Arrays.asList(interest);
		
		Person person = new Person(name,email,password,age,bio,job,interest1);
		request.setAttribute("myperson",person);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp");
		dispatcher.forward(request,response);
	}

}
