package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import business.PersonelBusiness;

/**
 * Servlet implementation class PersonelServlet
 */
@WebServlet("/index.htm")
public class PersonelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("liste", new PersonelBusiness().personelListesi());
		request.getRequestDispatcher("/WEB-INF/views/personelListesi.jsp").forward(request, response);
	}
}
