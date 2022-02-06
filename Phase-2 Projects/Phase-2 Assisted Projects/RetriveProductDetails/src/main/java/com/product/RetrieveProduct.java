package com.product;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/retrieve")
public class RetrieveProduct extends HttpServlet
{
	
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
 {
  
  response.setContentType("text/html");
  
  String id = request.getParameter("id");
	
  PrintWriter out = response.getWriter();
  
  String query="select * from pdtls where id=?";
  out.print("<h1>Product Details</h1>");
  
  try {
       Class.forName("com.mysql.jdbc.Driver");
       String url="jdbc:mysql://localhost:3306/";
       String dbName="prdt";
       String username="root";
       String password="Hemanth@12";
       Connection dbCon = DriverManager.getConnection(url+ dbName, username, password);
       PreparedStatement st= dbCon.prepareStatement(query);
       
       st.setString(1, id);
       
       ResultSet rs =st.executeQuery();
       
       while(rs.next()) 
       {
        
        out.println("Product Id :"+rs.getInt(1));
        out.print(" || Product Name :"+rs.getString(2));
        out.print(" || Product Price :"+rs.getInt(3));
       
   }
       
  }
  catch(Exception e)
  {
   
   System.out.println("Some Issue : "+ e.getMessage());
   
  }
  
 }
}


