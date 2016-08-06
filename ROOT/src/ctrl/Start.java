package ctrl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Start
 */
@WebServlet({"/Start/*"})
public class Start extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Start() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("In Front--begin: *****************");
		System.out.println("url = " + request.getRequestURL());
		System.out.println("uri = " + request.getRequestURI());
		System.out.println("pth = " + request.getPathInfo());
		System.out.println("Context Path = " + request.getContextPath());
//		System.out.println("In Front--finish *****************\n");
		
		String target = "/index.jspx";
		String pathInfo = request.getPathInfo();
		System.out.println("PathInfo = " + pathInfo);
		
		if (pathInfo == null)
		{
			response.sendRedirect(request.getContextPath() + "/Start/");
			return;
		}
		else
		{
			RequestDispatcher rd = this.getServletContext().getNamedDispatcher(pathInfo.substring(1));
			if (rd != null)
			{
				System.out.println("Arrived Here! Start.java");
				rd.forward(request, response);
			}
			else
			{
				request.setAttribute("notFound", "404");
				request.getRequestDispatcher(target).forward(request, response);
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	

}
