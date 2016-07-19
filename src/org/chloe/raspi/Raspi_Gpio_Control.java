package org.chloe.raspi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Raspi_Gpio__Control
 */
@WebServlet(description = "Control Raspberry Pi version 1 GPIO", urlPatterns = { "/Raspi_Gpio__Control" })
public class Raspi_Gpio_Control extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Raspi_Gpio_Control() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// get raspberry pin configuration
		boolean rpi_7 = request.getParameter("rpi_7") != null;
		boolean rpi_11 = request.getParameter("rpi_11") != null;
		boolean rpi_12 = request.getParameter("rpi_12") != null;
		boolean rpi_13 = request.getParameter("rpi_13") != null;
		boolean rpi_15 = request.getParameter("rpi_15") != null;
		boolean rpi_16 = request.getParameter("rpi_16") != null;
		boolean rpi_18 = request.getParameter("rpi_18") != null;
		boolean rpi_22 = request.getParameter("rpi_22") != null;
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		
		if (rpi_7 == true) {
			out.println("<h>rpi_7 ON</h>");
		}
		
		if (rpi_11 == true) {
			out.println("<h>rpi_11 ON</h>");
		}
		
		if (rpi_12 == true) {
			out.println("<h>rpi_12 ON</h>");
		}
		
		if (rpi_13 == true) {
			out.println("<h>rpi_13 ON</h>");
		}
		
		if (rpi_15 == true) {
			out.println("<h>rpi_15 ON</h>");
		}
		
		if (rpi_16 == true) {
			out.println("<h>rpi_16 ON</h>");
		}
		
		if (rpi_18 == true) {
			out.println("<h>rpi_18 ON</h>");
		}
		
		if (rpi_22 == true) {
			out.println("<h>rpi_22 ON</h>");
		}
		
		out.println("</body></html>");
		doGet(request, response);
	}

}
