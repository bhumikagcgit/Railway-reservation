package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cancelticket_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"adminlogin.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <div  class=\"admin\">\n");
      out.write("             <h1 style=\"margin-top: 100px; margin-left: 200px; color:  #ffccff;\"> YOU CAN PRINT YOUR TICKETS HERE  BY ENTERING YOUR USERID </h1>\n");
      out.write("                                                                                                                                                                                                                                                                                                                                                                                                  <br>\n");
      out.write("         <br>\n");
      out.write("        <form class=\"form-horizontal\"  action=\"canceltickactn.jsp\" method=\"post\">\n");
      out.write("    <div class=\"form-group\" style=\"margin-left: 400px\">\n");
      out.write("      <label class=\"control col-sm-3\" style=\"color: white!important;max-width:14%\">User Id</label>\n");
      out.write("      <div class=\"col-sm-4\">\n");
      out.write("        <input class=\"form-control\"  placeholder=\"Enter user id\" name=\"USERID\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("                 <br>\n");
      out.write("        <br>\n");
      out.write("  \n");
      out.write("              <div class=\"form-group\" style=\"margin-left: 400px\">\n");
      out.write("      <label class=\"control col-sm-3\"  style=\"color: white!important;max-width:14%\">DOJ:</label>\n");
      out.write("      <div class=\"col-sm-4\">\n");
      out.write("          <input class=\"form-control\"  type=\"date\"   name=\"doj\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("               <div class=\"form-group\" style=\"margin-left: 400px\">        \n");
      out.write("      <div class=\"col-sm-7\">\n");
      out.write("          <button type=\"submit\" class=\"btn btn-primary\" value=\"submit\" style=\"width:150px!important;height:35px!important;font-size:20px\">SUBMIT</button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("            \n");
      out.write("    </body>");
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
