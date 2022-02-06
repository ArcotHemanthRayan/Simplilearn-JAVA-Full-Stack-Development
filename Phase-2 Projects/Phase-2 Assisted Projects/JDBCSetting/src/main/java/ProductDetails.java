import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ecommerce.DBConnection;


@WebServlet("/ProductDetails")
public class ProductDetails extends HttpServlet 
{
        private static final long serialVersionUID = 1L;
       
   
    public ProductDetails() 
    {
        super();
    }

        
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
        {
                // TODO Auto-generated method stub
                
                try {
                         PrintWriter out = response.getWriter();
                         out.println("<html><body>");
                         
                        InputStream in = getServletContext().getResourceAsStream("/WEB-INF/config.prop");
                        Properties props = new Properties();
                        props.load(in);
                        
                        DBConnection conn = new DBConnection(props.getProperty("url"), props.getProperty("userid"), props.getProperty("password"));
                        Statement stmt = conn.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                        stmt.executeUpdate("insert into pdetails (pid, pname, price) values ('8, 'wm', 50000)");
                        ResultSet rst = stmt.executeQuery("select * from pdetails");
                        
                        while (rst.next()) 
                        {
                                out.println(rst.getInt("pid") + ", " + rst.getString("pname") + "<Br>");
                        }
                        
                        stmt.close();
                        
                        
                        
                        out.println("</body></html>");
                        conn.closeConnection();
                        
                } 
                catch (ClassNotFoundException e) 
                {
                        e.printStackTrace();
                } 
                catch (SQLException e) 
                {
                        e.printStackTrace();
                }
        }

        
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
        {
                // TODO Auto-generated method stub
                doGet(request, response);
        }

}
