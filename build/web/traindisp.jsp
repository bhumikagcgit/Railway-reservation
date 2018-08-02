<%@ page import="javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>
<%@ page import="java.sql.*" %>
<html>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>   


<body>
    <h3>THE AVAILABLE TRAINS FOR YOUR QUIERY</h3>
<head><link rel="stylesheet" href="traindisp.css"></head>
    <div style="width:500px; margin-left: 500px;">
        
           <table>
             <thead>
             <tr>
<td>TRAIN NUMBER </td>
<td>TRAIN NAME </td>
<td>FROM STATION</td>
<td>TO STATION</td>
<td>DEPARTURE TIME</td>
<td> ARRIVAL TIME</td>

</tr>
             </thead>
<%
        
        Connection con = null;
        String fromstation= request.getParameter("frmstn");
        String tostation= request.getParameter("tostn");
        ResultSet resultSet = null;
      
       
          
        try {
              Class.forName("oracle.jdbc.driver.OracleDriver").newInstance ();
              con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
              Statement  statement = con.createStatement();

            String query=("select TRAIN_NO, TNAME,FRM_STATION,TO_STATION,DEP_TIME,ARR_TIME from trains t where t.FRM_STATION='"+fromstation+"' and t.TO_STATION='"+tostation+"'");
            resultSet = statement.executeQuery(query);
            while(resultSet.next()){
           %>
           
<tr>
<td><%=resultSet.getInt("Train_no") %></td>
<td><%=resultSet.getString("Tname") %></td>
<td><%=resultSet.getString("frm_station") %></td>
<td><%=resultSet.getString("to_station") %></td>
<td><%=resultSet.getString("dep_time") %></td>
<td><%=resultSet.getString("arr_time") %></td>


 </tr>

 <%}%>

    </table>
           </div>
 <%
 con.close();
        } catch (Exception e) { 
        System.out.println(e);
        }
%>
   <div style=" margin-left: 550px; margin-top: 250px;">
   <button type="submit" class="btn btn-warning" onclick="location = 'userprofile.html'">back</button>
   </div>
</body>
</html>
