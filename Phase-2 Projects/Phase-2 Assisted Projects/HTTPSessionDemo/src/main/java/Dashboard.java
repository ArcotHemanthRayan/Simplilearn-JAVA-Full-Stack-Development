import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;


@WebServlet("/Dashboard")
public class Dashboard extends HttpServlet 
{
        private static final long serialVersionUID = 1L;
       
  
    public Dashboard() 
    {
        super();
    }

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
        {
        
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            
            HttpSession session=request.getSession(false);  
            String userId = null;
            if (session.getAttribute("userid") != null)
                userId =(String)session.getAttribute("userid");  
            if (userId == null ) 
            {
                out.println("No UserId was found in session.<br>");
            } else 
            {
                out.println("UserId obtained from session :" + userId + "<br>");
            }
            out.println("</body></html>");

        }

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
        {
                doGet(request, response);
        }

}
