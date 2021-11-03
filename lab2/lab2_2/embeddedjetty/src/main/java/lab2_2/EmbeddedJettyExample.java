package lab2_2.embeddedjetty;
 
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.servlet.ServletHandler;
 
public class EmbeddedJettyExample {
 
    public static void main(String[] args) throws Exception {
         
        Server server = new Server(8680);       
         
        ServletHandler servletHandler = new ServletHandler();
        server.setHandler(servletHandler);
                 
        servletHandler.addServletWithMapping(HelloServlet.class, "/");
         
        server.start();
        server.join();
 
    }
     
    public static class HelloServlet extends HttpServlet 
    {
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
        {
            response.setContentType("text/html");
            response.setStatus(HttpServletResponse.SC_OK);
            //response.getWriter().println("<h1>New Hello Simple Servlet</h1>"); 

            PrintWriter out = response.getWriter();
            try {
                // Write some content
                out.println("<html>");
                out.println("<head>");
                out.println("<title>BasicServlet</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h2>Boas " + request.getParameter("name") + ", temos aqui um servlet embedded." + "</h2>");
                out.println("<h2>Data/hora : " + new Date() + "</h2>");
                out.println("</body>");
                out.println("</html>");
            } finally {
                out.close();
            }
        } 
    }
 }