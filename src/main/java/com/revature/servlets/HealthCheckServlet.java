package com.revature.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;



public class HealthCheckServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        ObjectMapper om = new ObjectMapper();
		try(PrintWriter pw = response.getWriter();){
			pw.write("{ \"status\" : \"UP\"}");
		}
    }

    }