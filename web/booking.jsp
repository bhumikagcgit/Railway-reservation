<%-- 
    Document   : connection
    Created on : 4 Nov, 2017, 9:50:40 AM
    Author     : BHUMIKA
--%>
<%@ page import="javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>
<%@ page import="java.sql.*" %>

<%
        Connection con = null;
       

        String userid= request.getParameter("userid");
        String trainno= request.getParameter("trainno");
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String doj = request.getParameter("doj");
       
        
       

        String queryText = ("insert into hr.PSNGR(USERID,TRAIN_NO,NAME, AGE, DOJ ) values('"+userid+"','"+trainno+"','"+name+"','"+age+"','"+doj+"')");
          System.out.println("queryText"  + queryText);
           String sqlt= (" update  trainstatus set availseats = availseats-1 where train_no='"+trainno+"' and tdate='"+doj+"';");
           System.out.println("queryText"  + sqlt);
           
        try {
              Class.forName("oracle.jdbc.driver.OracleDriver").newInstance ();
              con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
               PreparedStatement ps = null;

            String query="insert into PSNGR values(?,?,?,?,?)";
            String sql= (" update  trainstatus set availseats = availseats-1 where train_no='"+trainno+"' and tdate='"+doj+"'");
              ps = con.prepareStatement(sql);
              Statement  statement = con.createStatement();
            statement.executeQuery(queryText);
            ps.executeUpdate();
            statement.close();
            con.close();
        } catch (Exception e) { 
        System.out.println(e);
        }
%>
<html>
<body>
<head>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="traindisp.css"></head>
<h2 style='margin-left: 400px;  margin-top: 100px;' > CONFIRM THE PASSENGER WITH  DETAILS</h2> 
<div style="width:500px; margin-left: 500px; margin-top: 200px;">
    
 <table>
 <thead>
<tr>
<td>USER ID </td>
<td> TRAIN NO </td>
<td>NAME </td>
<td> AGE </td>
<td> DOJ </td>



</tr>
</thead>
<tr>
<td><%=request.getParameter("userid") %></td>
<td><%=request.getParameter("trainno") %></td>
<td><%=request.getParameter("name") %></td>
<td><%=request.getParameter("age") %></td>
<td><%=request.getParameter("doj") %></td>


</tr>

 </table>
           
</div>
<br>
<br>
<br>
 <div class="form-group" style="margin-left: 400px">        
      <div class="col-sm-1">
          <button type="submit" class="btn btn-primary" value="CONFIRM" onclick="location = 'userprofile.html'" style="width:150px!important;height:35px!important;font-size:20px">CONFIRM</button>
      </div> 
</div>
</body>
</html>

