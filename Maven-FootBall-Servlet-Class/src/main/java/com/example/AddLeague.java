package com.example;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.League;

/**
 * Servlet implementation class AddLeague
 */

public class AddLeague extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}
	public void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

				response.setContentType("text/html");
				PrintWriter out1=response.getWriter();
				String leagueTitle=request.getParameter("title").toString();
				//String leagueSeason=request.getParameter("season").toString();
				int leagueYear=Integer.parseInt(request.getParameter("year"));
				
				if(leagueYear>2010 && leagueYear<=2020 && leagueTitle.length()>8)
				{
					RequestDispatcher view=request.getRequestDispatcher("success.html");
					view.forward(request, response);
				}
				else
				{
					RequestDispatcher view=request.getRequestDispatcher("error.html");
					view.forward(request, response);
				}
				
		
		
		
	}
}
