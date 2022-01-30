package com.connection;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.database.DataBaseConnection;

@WebServlet("/productAdd")
public class AdingData extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	public AdingData() 
	{
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

		String url = "jdbc:mysql://localhost:3306/prdt";
		String userName = "root";
		String password = "Hemanth@12";

		PrintWriter out = response.getWriter();
		out.println("<html> <body>");
		try {
			DataBaseConnection dbConnection = new DataBaseConnection( url, userName, password);

			Connection connection = dbConnection.getConnection();

			PreparedStatement stmt = connection.prepareStatement("insert into pdtls (pname,price) values (? , ?)");

			stmt.setString(1, "Laptop");
			stmt.setInt(2, 30000);
			
			stmt.executeUpdate();
			
			out.println("Data inserted successfully");
			stmt.close();
			out.println("</body></html>");
			dbConnection.closeConnection();

		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
