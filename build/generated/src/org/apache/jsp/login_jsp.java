package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("    <html>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>   \n");
      out.write("\n");
      out.write("    <head><link rel=\"stylesheet\" href=\"adminlogin.css\"></head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("            <h1> SOUTHERN  RAILWAYS ADMIN  LOGIN</h1>\n");
      out.write("<form action=\"login.jsp\" method=\"post\">\n");
      out.write("        <br>\n");
      out.write("            USER ID:\n");
      out.write("            <input type=\"text\" name=\"userid\" placeholder=\"enter userid\">\n");
      out.write("        </br>\n");
      out.write("        <br>\n");
      out.write("        </br>\n");
      out.write("        <br>\n");
      out.write("        PASSWORD:\n");
      out.write("            <input type=\"password\" name=\"pwd\" placeholder=\"enter password\">\n");
      out.write("        </br>\n");
      out.write("        <br>\n");
      out.write("        </br>\n");
      out.write("        <br>\n");
      out.write("        <input  type=\"button\"value=\"LOGIN\" onclick=\"openPage('logvalidate.jsp')\"/>\n");
      out.write("</form>\n");
      out.write("    </body>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        function openPage(pageURL)\n");
      out.write("        {\n");
      out.write("            window.location.href=pageURL;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    \n");
      out.write(" </html>\n");
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
