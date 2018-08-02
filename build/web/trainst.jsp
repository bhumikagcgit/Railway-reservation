<%-- 
    Document   : connection
    Created on : 4 Nov, 2017, 9:50:40 AM
    Author     : BHUMIKA
--%>
<html>
<body style="margin-left: 250px; margin-top: 100px">
<%@ page import="javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>
<%@ page import="java.sql.*" %>

<%
        Connection con = null;
       

        String trainno = request.getParameter("trainno");
        String date = request.getParameter("date");
        String avail = request.getParameter("avail");
      

         

        String queryText = ("insert into hr.trainstatus(train_no,tdate , availseats) values('"+trainno+"','"+date+"','"+avail+"')");
          System.out.println("queryText"  + queryText);
        try {
              Class.forName("oracle.jdbc.driver.OracleDriver").newInstance ();
              con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
              

            String query="insert into trainstatus values(?,?,?)";

           Statement  statement = con.createStatement();
            statement.executeQuery(queryText);
            
            statement.close();
            con.close();
        } catch (Exception e) { 
        System.out.println(e);
        }
%>



</body>
</html>
