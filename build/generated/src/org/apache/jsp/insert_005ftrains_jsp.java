package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public final class insert_005ftrains_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>   \n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("function addAction()\n");
      out.write("{\t\n");
      out.write("    document.location.href(\"connection.jsp\");\n");
      out.write("}\t\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("            \n");
      out.write("    </head>\n");
      out.write("    <body style=\"margin-top: 150px; margin-left: 500px;\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <h1>  THIS IS ADMIN PAGE <h1>\n");
      out.write("        <br>        \n");
      out.write("        <h2>  YOU CAN ADD  TRAIN DETAILS HERE </h2>\n");
      out.write("        </br>\n");
      out.write("        <br>\n");
      out.write("    <form name=\"myForm\" action=\"connection.jsp\" method=\"POST\" >\n");
      out.write("    <td> Train No:</td>\n");
      out.write("    <td> <input type=\"text\" name=\"trainno\"</td>\n");
      out.write("    </br>\n");
      out.write("    <br>\n");
      out.write("    <td>Train Name:</td>\n");
      out.write("    <td> <input type=\"text\" name=\"trainname\"</td>\n");
      out.write("    </br>\n");
      out.write("    <br>\n");
      out.write("    \n");
      out.write("    From station:<td><input type=\"text\" name=\"fromstation\"</td> \n");
      out.write("    <td>To station:</td> <td><input type=\"text\" name=\"tostation\"</td>\n");
      out.write("    </br>\n");
      out.write("    <br>\n");
      out.write("    arrival time:<input type=\"time\" name=\"arrivaltime\">    \n");
      out.write("    departure time:<input type=\"time\" name=\"departuretime\">\n");
      out.write("   </br>\n");
      out.write("  \n");
      out.write("    <br>\n");
      out.write("    <td> <input  type=\"submit\" value=\"ADD\" onclick= \"addAction('connection.jsp')\"/></td>\n");
      out.write("    \n");
      out.write(" \n");
      out.write("    </br> \n");
      out.write("<form/>  \n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\n");
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
