import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;



@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet 
{
        private static final long serialVersionUID = 1L;
       
  
    public LoginServlet() 
    {
        super();
    }

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
        {
                
                 String userId = request.getParameter("userid");
                 HttpSession session=request.getSession();  
             session.setAttribute("userid",  userId);
                          
             response.sendRedirect("dashboard");  
                
        }

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
        {
                // TODO Auto-generated method stub
                doGet(request, response);
        }

}
