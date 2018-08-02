package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userprof_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>  </head>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("    <body style=\"margin-left: 300px\">\n");
      out.write("        <h1> WELCOME TO SOUTH INDIAN RAILWAYS</h1>\n");
      out.write("        <br>\n");
      out.write("        </br>\n");
      out.write("        <br>\n");
      out.write("        </br>\n");
      out.write("    <button type=\"button\" onclick=\"location = 'traindisp.jsp'\">Available Trains</button>\n");
      out.write("    \n");
      out.write("    <input type=\"button\" value=\"Train Status\" onclick=\"location = 'stadisp.jsp'\">\n");
      out.write("    <input type=\"button\" value=\"Book Tickets\" onclick=\"location = 'booking.jsp'\">\n");
      out.write("    <input type=\"button\" value=\"logout\" onclick=\"location = 'logout.jsp'\">\n");
      out.write("    <br>\n");
      out.write("    </br>\n");
      out.write("    <br>\n");
      out.write("    </br>\n");
      out.write("    <form name=\"myForm\" action=\"Etraindisp.jsp\" method=\"POST\">\n");
      out.write("      <td>From station:</td><td><input type=\"text\" name=\"frmstn\"</td> \n");
      out.write("    <td>To station:</td> <td><input type=\"text\" name=\"tostn\"</td>\n");
      out.write("    </form>\n");
      out.write("     <button type=\"button\" onclick=\"location = 'Etraindisp.jsp'\">Available Trains</button>\n");
      out.write("   \n");
      out.write("   \n");
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
