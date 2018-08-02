package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public final class booking_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");

        Connection con = null;
       

        String userid= request.getParameter("userid");
        String trainno= request.getParameter("trainno");
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String doj = request.getParameter("doj");
       
        
       

        String queryText = ("insert into hr.PSNGR(USERID,TRAIN_NO,NAME, AGE, DOJ ) values('"+userid+"','"+trainno+"','"+name+"','"+age+"','"+doj+"')");
          System.out.println("queryText"  + queryText);
           String sqlt= (" update  trainstatus set availseats = availseats-1 where train_no='"+trainno+"' and tdate='"+doj+"';");
           System.out.println("queryText"  + sqlt);
           
        try {
              Class.forName("oracle.jdbc.driver.OracleDriver").newInstance ();
              con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
               PreparedStatement ps = null;

            String query="insert into PSNGR values(?,?,?,?,?)";
            String sql= (" update  trainstatus set availseats = availseats-1 where train_no='"+trainno+"' and tdate='"+doj+"'");
              ps = con.prepareStatement(sql);
              Statement  statement = con.createStatement();
            statement.executeQuery(queryText);
            ps.executeUpdate();
            statement.close();
            con.close();
        } catch (Exception e) { 
        System.out.println(e);
        }

      out.write("\n");
      out.write("<html>\n");
      out.write("<body>\n");
      out.write("<head>\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("  <link rel=\"stylesheet\" href=\"traindisp.css\"></head>\n");
      out.write("<h2 style='margin-left: 400px;  margin-top: 100px;' > CONFIRM THE PASSENGER WITH  DETAILS</h2> \n");
      out.write("<div style=\"width:500px; margin-left: 500px; margin-top: 200px;\">\n");
      out.write("    \n");
      out.write(" <table>\n");
      out.write(" <thead>\n");
      out.write("<tr>\n");
      out.write("<td>USER ID </td>\n");
      out.write("<td> TRAIN NO </td>\n");
      out.write("<td>NAME </td>\n");
      out.write("<td> AGE </td>\n");
      out.write("<td> DOJ </td>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("</thead>\n");
      out.write("<tr>\n");
      out.write("<td>");
      out.print(request.getParameter("userid") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(request.getParameter("trainno") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(request.getParameter("name") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(request.getParameter("age") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(request.getParameter("doj") );
      out.write("</td>\n");
      out.write("\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write(" </table>\n");
      out.write("           \n");
      out.write("</div>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write(" <div class=\"form-group\" style=\"margin-left: 400px\">        \n");
      out.write("      <div class=\"col-sm-1\">\n");
      out.write("          <button type=\"submit\" class=\"btn btn-primary\" value=\"CONFIRM\" onclick=\"location = 'userprofile.html'\" style=\"width:150px!important;height:35px!important;font-size:20px\">CONFIRM</button>\n");
      out.write("      </div> \n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
