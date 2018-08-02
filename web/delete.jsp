<%@ page import="javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>
<%@ page import="java.sql.*" %>
<html>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>   


  <body style="color:  crimson; font:  bolder; font-size:  x-large;">
  
   <head><link rel="stylesheet" href="delete.css"></head>
<%
        Connection con = null;
        PreparedStatement ps = null;
        String train_num = request.getParameter("train_no");
      System.out.println(train_num);
        try {
              Class.forName("oracle.jdbc.driver.OracleDriver");
              con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
              String sql= ("delete from hr.trains where TRAIN_NO='"+train_num+"'");
              ps = con.prepareStatement(sql);
              int i = ps.executeUpdate();
if(i > 0)
{%>
<%
out.print("Record  Deleted Successfully");
%>
<% 
}
else
{%>
<%
out.println("There is a problem in Deleting Record."); 
out.print("Check Manually in your Database");
} %>
<%

con.close();
}
        catch (Exception e) { 
        System.out.println(e);
        }
%>
   <br>
   <br>
   <br>
  <div class="form-group" style="margin-left: 400px">        
      <div class="col-sm-7">
          <button type="submit" class="btn btn-primary" value="BACK"   onclick="location = 'adminprof.html'" style="width:85px!important;height:35px!important;font-size:20px">BACK</button>
      </div>
    </div>
</body>
</html>