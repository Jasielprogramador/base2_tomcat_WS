package nirepaketea;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter http_out = response.getWriter();
		
		System.out.println("---> Login servlet-ean sartzen...");
		
		
		String erabiltzailea = request.getParameter("username");
		String pasahitza = request.getParameter("password");
		System.out.println("\tErabiltzailea : "+erabiltzailea);
		System.out.println("Pasahitza : "+pasahitza);
		
		if(erabiltzailea.equals("asier") && pasahitza.equals("123")) {
			response.sendRedirect("/proba1/html/ongiEtorri.html");
		}
		else {
			response.sendRedirect("/proba1/html/login_error.html");
		}
		
		
		
		System.out.println("---> Login servlet-ean ateratzen...");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
