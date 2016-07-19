package org.chloe.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.chloe.raspi.Raspi_Gpio_Control;

/**
 * Servlet implementation class Raspi_Servlet
 */
@WebServlet("/Raspi_Servlet")
public class Raspi_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Raspi_Servlet() {
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
		doGet(request, response);
		// TODO Auto-generated method stub
		
		// get raspberry pin configuration
		boolean GPIO_00 = request.getParameter("gpio0") != null;
		boolean GPIO_01 = request.getParameter("gpio1") != null;
		boolean GPIO_02 = request.getParameter("gpio2") != null;
		boolean GPIO_03 = request.getParameter("gpio3") != null;
		boolean GPIO_04 = request.getParameter("gpio4") != null;
		boolean GPIO_05 = request.getParameter("gpio5") != null;
		boolean GPIO_06 = request.getParameter("gpio6") != null;
		boolean GPIO_07 = request.getParameter("gpio7") != null;
		
		// assign control
		Raspi_Gpio_Control rpi = new Raspi_Gpio_Control();
		
		rpi.toggleON(GPIO_00, GPIO_01, GPIO_02, GPIO_03, GPIO_04, GPIO_05,
				GPIO_06, GPIO_07);
				
	}

}
