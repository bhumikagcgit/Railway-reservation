package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class logout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <head>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"logout.css\">\n");
      out.write("    </head>\n");
      out.write("    <body style=\" margin-left: 300px; margin-top: 300px;\">\n");
      out.write("      \n");
      out.write("        <h1>YOU ARE LOGGED OUT OF WEBSITE </h1>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"form-group\" style=\"margin-left: 400px\">        \n");
      out.write("      <div class=\"col-sm-7\">\n");
      out.write("          <button type=\"submit\" class=\"btn btn-primary\" value=\"USER LOGIN\" onclick=\"location='userlogin1.jsp'\" style=\"width:185px!important;height:35px!important;font-size:20px\"> User Login</button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"form-group\" style=\"margin-left: 400px\">        \n");
      out.write("      <div class=\"col-sm-7\">\n");
      out.write("          <button type=\"submit\" class=\"btn btn-primary\" value=\" ADMIN LOGIN\" onclick=\"location='adminlogin1.jsp'\"style=\"width:185px!important;height:35px!important;font-size:20px\"> Admin Login</button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("        </br>\n");
      out.write("    </body>\n");
      out.write("    \n");
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
