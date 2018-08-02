package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public final class printticketactn_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write(" <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>   \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        ");

        
        Connection con = null;
        String userid= request.getParameter("USERID");
        ResultSet resultSet = null;
      
       
          
        try {
              Class.forName("oracle.jdbc.driver.OracleDriver").newInstance ();
              con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
              Statement  statement = con.createStatement();

            String query=("select t.TRAIN_NO, t.TNAME,t.FRM_STATION,t.TO_STATION,t.DEP_TIME,t.ARR_TIME,p.NAME,p.DOJ,p.AGE from trains t , psngr p where p.userid ='"+userid+"' and p.train_no = t.train_no"  );
            resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                
           
      out.write("\n");
      out.write("           \n");
      out.write("\n");
      out.write("          <div  class=\"flex-container\"> \n");
      out.write("              <h1 style=\"margin-left:38px\">SOUTHERN RAILWAYS INDIA</h1>\n");
      out.write("                  <div style=\"padding:8px!important;padding-left: 100px!important;\">\n");
      out.write("                   <div> <b>TRAIN NO: </b>");
      out.print(resultSet.getInt("Train_no") );
      out.write("</div><br>\n");
      out.write("                   <div><b>TRAIN NAME:</b> ");
      out.print(resultSet.getString("Tname") );
      out.write("</div><br>\n");
      out.write("                   <div><b>FROM STATION:</b> ");
      out.print(resultSet.getString("frm_station") );
      out.write("\n");
      out.write("                       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>TO STATION:</b> ");
      out.print(resultSet.getString("to_station") );
      out.write("</div><br>\n");
      out.write("                   <div><b>DEPARTURE TIME:</b> ");
      out.print(resultSet.getString("dep_time") );
      out.write("\n");
      out.write("                       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>ARRIVAL TIME </b>:");
      out.print(resultSet.getString("arr_time") );
      out.write("</div><br>\n");
      out.write("               \n");
      out.write("               <div><b>NAME:</b>");
      out.print(resultSet.getString("name") );
      out.write("</div><br>\n");
      out.write("               <div><b>DOJ:</b>");
      out.print(resultSet.getString("doj") );
      out.write("</div><br>\n");
      out.write("               <div><b>AGE:</b>");
      out.print(resultSet.getString("age") );
      out.write("</div><br>\n");
      out.write("\n");
      out.write("\n");
}
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" ");

 con.close();
        } catch (Exception e) { 
        System.out.println(e);
        }

      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("           </div>\n");
      out.write("\n");
      out.write("           </div>\n");
      out.write(" <div style=\"margin-top:2px;margin-left:650px!important;\">\n");
      out.write("       <button type=\"button\" class=\"btn btn-warning\" onclick=\"myFunction()\">print</button>\n");
      out.write("   <button type=\"button\" class=\"btn btn-warning\" onclick=\"location = 'userprofile.html'\">back</button>\n");
      out.write("   </div>\n");
      out.write("<script>\n");
      out.write("function myFunction() {\n");
      out.write("    window.print();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("<style>\n");
      out.write(".flex-container {\n");
      out.write("  display: flex;\n");
      out.write("  margin-top: 50px;\n");
      out.write("  flex-direction: column;\n");
      out.write("  background-color: lightgrey;\n");
      out.write("  margin-left: 450px;\n");
      out.write("  align-content:center;\n");
      out.write("  border-radius: 50px;\n");
      out.write("  width:550px;\n");
      out.write("  font-size: 12px;\n");
      out.write("  \n");
      out.write("}\n");
      out.write(".flex-container>div {\n");
      out.write("  padding: 3px;\n");
      out.write("  margin-left:5spx\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    \n");
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
