<%@page import="java.sql.*" %>
<% 
     Connection con = null;
String admin_id=request.getParameter("USERID");
String password=request.getParameter("password");
try{
Class.forName("oracle.jdbc.OracleDriver");
con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select * from ADMIN where ADMIN.ADMINID='"+admin_id+"'and ADMIN.PWD ='"+password+"'");
if(rs.next()){
  session.setAttribute("adminid",admin_id);
  response.sendRedirect("adminprof.html");
}
else{
 out.println("INVALID USER!!!");
}
}
catch(Exception e)
        {
        out.println("error");
        }
%>
