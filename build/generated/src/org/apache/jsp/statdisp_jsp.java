package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public final class statdisp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write(" <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>   \n");
      out.write("  <link rel=\"stylesheet\" href=\"statdisp.css\">\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    <h3 style=\"color:  #008CBA; margin-top: 50px;\">THE SEATS AVAILABILITY OF TRAINS </h3>\n");
      out.write("<head><link rel=\"stylesheet\" href=\"traindisp.css\"></head>\n");
      out.write("    <div style=\"width:500px; margin-left: 500px;\">\n");
      out.write("        \n");
      out.write("           <table>\n");
      out.write("             <thead style=\"color:  #ff0033;\">\n");
      out.write("             <tr>\n");
      out.write("<td>TRAIN NUMBER </td>\n");
      out.write("<td>ON THE DATE </td>\n");
      out.write("<td>AVAIL SEATS</td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("             </thead>\n");

        
        Connection con = null;
        ResultSet resultSet = null;
      
        
          
        try {
              Class.forName("oracle.jdbc.driver.OracleDriver").newInstance ();
              con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
              Statement  statement = con.createStatement();

            String query=("select TRAIN_NO ,TDATE,AVAILSEATS from hr.trainstatus");
            resultSet = statement.executeQuery(query);
            while(resultSet.next()){
           
      out.write("\n");
      out.write("           \n");
      out.write("           <tr style=\"color:  #000099; font: bolder;\">\n");
      out.write("<td>");
      out.print(resultSet.getInt("TRAIN_NO") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("TDATE") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("AVAILSEATS") );
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write(" ");
}
      out.write("\n");
      out.write("\n");
      out.write("    </table>\n");
      out.write("           </div>\n");

 con.close();
        } catch (Exception e) { 
        System.out.println(e);
        }

      out.write("\n");
      out.write("<div style=\" margin-left: 550px; margin-top: 250px;\">\n");
      out.write("   <button type=\"submit\" class=\"btn btn-warning\" onclick=\"location = 'userprofile.html'\">back</button>\n");
      out.write("   </div>\n");
      out.write("   \n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
