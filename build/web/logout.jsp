<%-- 
    Document   : logout
    Created on : 6 Nov, 2017, 11:30:58 PM
    Author     : BHUMIKA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="logout.css">
    </head>
    <body style=" margin-left: 300px; margin-top: 300px;">
      
        <h1>YOU ARE LOGGED OUT OF WEBSITE </h1>
        <br>
        <div class="form-group" style="margin-left: 400px">        
      <div class="col-sm-7">
          <button type="submit" class="btn btn-primary" value="USER LOGIN" onclick="location='userlogin1.jsp'" style="width:185px!important;height:35px!important;font-size:20px"> User Login</button>
      </div>
    </div>
        <br>
        <br>
        <div class="form-group" style="margin-left: 400px">        
      <div class="col-sm-7">
          <button type="submit" class="btn btn-primary" value=" ADMIN LOGIN" onclick="location='adminlogin1.jsp'"style="width:185px!important;height:35px!important;font-size:20px"> Admin Login</button>
      </div>
    </div>
        
        </br>
    </body>
    
</html>
