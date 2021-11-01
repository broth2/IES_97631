package lab2_1.aplic;
 
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet(name = "BasicServlet", urlPatterns = {"/BasicServlet"})
public class BasicServlet extends HttpServlet {
 
    private static final long serialVersionUID = -1915463532411657451L;
 
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException 
    {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        if (request.getParameter("name")== null){
            throw new RuntimeException("parameter unavailable!");
        }else{
            try {
                // Write some content
                out.println("<html>");
                out.println("<head>");
                out.println("<title>BasicServlet</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h2>Boas " + request.getParameter("name") + ", temos aqui um servlet basico." + "</h2>");
                out.println("<h2>Data/hora : " + new Date() + "</h2>");
                out.println("</body>");
                out.println("</html>");
            } finally {
                out.close();
            }
        }
    }
     
}