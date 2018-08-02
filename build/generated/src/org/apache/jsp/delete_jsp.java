package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public final class delete_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("  <body style=\"color:  crimson; font:  bolder; font-size:  x-large;\">\n");
      out.write("  \n");
      out.write("   <head><link rel=\"stylesheet\" href=\"delete.css\"></head>\n");

        Connection con = null;
        PreparedStatement ps = null;
        String train_num = request.getParameter("train_no");
      System.out.println(train_num);
        try {
              Class.forName("oracle.jdbc.driver.OracleDriver");
              con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
              String sql= ("delete from hr.trains where TRAIN_NO='"+train_num+"'");
              ps = con.prepareStatement(sql);
              int i = ps.executeUpdate();
if(i > 0)
{
      out.write('\n');

out.print("Record  Deleted Successfully");

      out.write('\n');
 
}
else
{
      out.write('\n');

out.println("There is a problem in Deleting Record."); 
out.print("Check Manually in your Database");
} 
      out.write('\n');


con.close();
}
        catch (Exception e) { 
        System.out.println(e);
        }

      out.write("\n");
      out.write("   <br>\n");
      out.write("   <br>\n");
      out.write("   <br>\n");
      out.write("  <div class=\"form-group\" style=\"margin-left: 400px\">        \n");
      out.write("      <div class=\"col-sm-7\">\n");
      out.write("          <button type=\"submit\" class=\"btn btn-primary\" value=\"BACK\"   onclick=\"location = 'adminprof.html'\" style=\"width:85px!important;height:35px!important;font-size:20px\">BACK</button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
