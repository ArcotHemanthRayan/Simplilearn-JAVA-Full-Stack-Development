package com.connection;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.database.DataBaseConnection;

@WebServlet("/productList")
public class Data extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	
	public Data() 
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
		try 
		{
			DataBaseConnection dbConnection = new DataBaseConnection( url, userName, password);
			
			Connection connection = dbConnection.getConnection();
			
			Statement stmt = connection.createStatement();
			
			
			ResultSet rs = stmt.executeQuery("select * from pdtls");
			
			while(rs.next()) 
			{
				String productName = rs.getString("pname");
				int price = rs.getInt("price");
				
				out.println("Product Name : "+productName+" & "+"Product Price : "+price+" " +"<br/>");
			}

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
