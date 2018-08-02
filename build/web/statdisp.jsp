<%@ page import="javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>
<%@ page import="java.sql.*" %>
<html>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>   
  <link rel="stylesheet" href="statdisp.css">

<body>
    
    <h3 style="color:  #008CBA; margin-top: 50px;">THE SEATS AVAILABILITY OF TRAINS </h3>
<head><link rel="stylesheet" href="traindisp.css"></head>
    <div style="width:500px; margin-left: 500px;">
        
           <table>
             <thead style="color:  #ff0033;">
             <tr>
<td>TRAIN NUMBER </td>
<td>ON THE DATE </td>
<td>AVAIL SEATS</td>

</tr>
             </thead>
<%
        
        Connection con = null;
        ResultSet resultSet = null;
      
        
          
        try {
              Class.forName("oracle.jdbc.driver.OracleDriver").newInstance ();
              con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
              Statement  statement = con.createStatement();

            String query=("select TRAIN_NO ,TDATE,AVAILSEATS from hr.trainstatus");
            resultSet = statement.executeQuery(query);
            while(resultSet.next()){
           %>
           
           <tr style="color:  #000099; font: bolder;">
<td><%=resultSet.getInt("TRAIN_NO") %></td>
<td><%=resultSet.getString("TDATE") %></td>
<td><%=resultSet.getString("AVAILSEATS") %></td>
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
