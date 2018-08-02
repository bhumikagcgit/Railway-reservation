<%@ page import="javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>
<%@ page import="java.sql.*" %>
<html>
    <head>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>   
    </head>
    <body>
       
        <%
        
        Connection con = null;
        String userid= request.getParameter("USERID");
        String doj = request.getParameter("doj");
        String trainno= request.getParameter("trainno");
         String name = request.getParameter("name");
        ResultSet resultSet = null;
      
       
          
        try {
              Class.forName("oracle.jdbc.driver.OracleDriver").newInstance ();
              con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
              Statement  statement = con.createStatement();

            String query=("select t.TRAIN_NO, t.TNAME,t.FRM_STATION,t.TO_STATION,t.DEP_TIME,t.ARR_TIME,p.NAME,p.DOJ,p.AGE from trains t , psngr p where p.userid ='"+userid+"' and t.train_no='"+trainno+"' and p.doj='"+doj+"' and p.name='"+name+"'");
            resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                
           %>
           

          <div  class="flex-container"> 
              <h1 style="margin-left:38px">SOUTHERN RAILWAYS INDIA</h1>
                  <div style="padding:8px!important;padding-left: 100px!important;">
                   <div> <b>TRAIN NO: </b><%=resultSet.getInt("Train_no") %></div><br>
                   <div><b>TRAIN NAME:</b> <%=resultSet.getString("Tname") %></div><br>
                   <div><b>FROM STATION:</b> <%=resultSet.getString("frm_station") %>
                       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>TO STATION:</b> <%=resultSet.getString("to_station") %></div><br>
                   <div><b>DEPARTURE TIME:</b> <%=resultSet.getString("dep_time") %>
                       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>ARRIVAL TIME </b>:<%=resultSet.getString("arr_time") %></div><br>
               
               <div><b>NAME:</b><%=resultSet.getString("name") %></div><br>
               <div><b>DOJ:</b><%=resultSet.getString("doj") %></div><br>
               <div><b>AGE:</b><%=resultSet.getString("age") %></div><br>


<%}%>


 <%
 con.close();
        } catch (Exception e) { 
        System.out.println(e);
        }
%>

  
           </div>

           </div>
 <div style="margin-top:2px;margin-left:650px!important;">
       <button type="button" class="btn btn-warning" onclick="myFunction()">print</button>
   <button type="button" class="btn btn-warning" onclick="location = 'userprofile.html'">back</button>
   </div>
<script>
function myFunction() {
    window.print();
}
</script>
</body>
<style>
.flex-container {
  display: flex;
  margin-top: 50px;
  flex-direction: column;
  background-color: lightgrey;
  margin-left: 450px;
  align-content:center;
  border-radius: 50px;
  width:550px;
  font-size: 12px;
  
}
.flex-container>div {
  padding: 3px;
  margin-left:5spx
}

</style>


</html>

    
