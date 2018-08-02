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
        String trainname = request.getParameter("trainname");
        String fromstn = request.getParameter("fromstation");
        String tostation= request.getParameter("tostation");
        String arrtime= request.getParameter("arrivaltime");
        String deptime= request.getParameter("departuretime");

         

        String queryText = ("insert into hr.trains(train_no, tname, frm_station, to_station, dep_time, arr_time) values('"+trainno+"','"+trainname+"','"+fromstn+"','"+tostation+"','"+deptime+"','"+arrtime+"')");
          System.out.println("queryText"  + queryText);
        try {
              Class.forName("oracle.jdbc.driver.OracleDriver").newInstance ();
              con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
              

            String query="insert into trains values(?,?,?,?,?,?)";

           Statement  statement = con.createStatement();
            statement.executeQuery(queryText);
            
            statement.close();
            con.close();
        } catch (Exception e) { 
        System.out.println(e);
        }
%>

<br>

<h1> THE ABOVE DETAILS ARE ADDED </h1>
</br>
<p>
<br> TRAIN NO:
<td><%=request.getParameter("trainno")%></td>
</br>
<br> TRAIN NAME:
<td><%=request.getParameter("trainname")%></td>
</br>
<br> FROM STATION:
<td><%=request.getParameter("fromstation")%></td>
</br>
<br> TO STATION:
<td><%=request.getParameter("tostation")%></td>
</br>
<br> DEPARTURE TIME:
<td><%=request.getParameter("departuretime")%></td>
</br>
<br>ARRIVAL TIME:
<td><%=request.getParameter("arrivaltime")%></td>
</br>
</p>
<br> <input type ="button" value="confirm" onclick="openPage('adminprof.html')">
</br>
<script type="text/javascript">
        function openPage(pageURL)
        {
            window.location.href=pageURL;
            
        }
        </script>


</body>
</html>
