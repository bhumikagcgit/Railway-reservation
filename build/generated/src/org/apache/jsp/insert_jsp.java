package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public final class insert_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<body style=\"margin-left: 250px; margin-top: 100px\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

        Connection con = null;
       

        String trainno = request.getParameter("trainno");
        String trainname = request.getParameter("trainname");
        String fromstn = request.getParameter("fromstation");
        String tostation= request.getParameter("tostation");
        String arrtime= request.getParameter("arrivaltime");
        String deptime= request.getParameter("departuretime");

         

        String queryText = ("insert into hr.trains(train_no, tname, frm_station, to_station, dep_time, arr_time) values('"+trainno+"','"+trainname+"','"+fromstn+"','"+tostation+"','"+deptime+"','"+arrtime+"')");
          System.out.println("queryText"  + queryText);
        try {
              Class.forName("oracle.jdbc.driver.OracleDriver").newInstance ();
              con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
              

            String query="insert into trains values(?,?,?,?,?,?)";

           Statement  statement = con.createStatement();
            statement.executeQuery(queryText);
            
            statement.close();
            con.close();
        } catch (Exception e) { 
        System.out.println(e);
        }

      out.write("\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<h1> THE ABOVE DETAILS ARE ADDED </h1>\n");
      out.write("</br>\n");
      out.write("<p>\n");
      out.write("<br> TRAIN NO:\n");
      out.write("<td>");
      out.print(request.getParameter("trainno"));
      out.write("</td>\n");
      out.write("</br>\n");
      out.write("<br> TRAIN NAME:\n");
      out.write("<td>");
      out.print(request.getParameter("trainname"));
      out.write("</td>\n");
      out.write("</br>\n");
      out.write("<br> FROM STATION:\n");
      out.write("<td>");
      out.print(request.getParameter("fromstation"));
      out.write("</td>\n");
      out.write("</br>\n");
      out.write("<br> TO STATION:\n");
      out.write("<td>");
      out.print(request.getParameter("tostation"));
      out.write("</td>\n");
      out.write("</br>\n");
      out.write("<br> DEPARTURE TIME:\n");
      out.write("<td>");
      out.print(request.getParameter("departuretime"));
      out.write("</td>\n");
      out.write("</br>\n");
      out.write("<br>ARRIVAL TIME:\n");
      out.write("<td>");
      out.print(request.getParameter("arrivaltime"));
      out.write("</td>\n");
      out.write("</br>\n");
      out.write("</p>\n");
      out.write("<br> <input type =\"button\" value=\"confirm\" onclick=\"openPage('adminprof.html')\">\n");
      out.write("</br>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("        function openPage(pageURL)\n");
      out.write("        {\n");
      out.write("            window.location.href=pageURL;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
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
