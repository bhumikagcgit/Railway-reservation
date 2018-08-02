
<%-- 
    Document   : adminlogin1
    Created on : 14 Nov, 2017, 3:29:23 PM
    Author     : BHUMIKA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="adminlogin.css">
    </head>
    <body>
     
   <div  class="admin">
  <h1 style="color:white!important;"> SOUTHERN  RAILWAYS ADMIN  LOGIN</h1>
  <br>
  <br>
  <form class="form-horizontal"  action="adminlogval.jsp" method="post">
    <div class="form-group" style="margin-left: 400px">
      <label class="control col-sm-3" for="email" style="color: white!important;max-width:14%">User Id</label>
      <div class="col-sm-4">
        <input class="form-control" id="email" placeholder="Enter user id" name="USERID">
      </div>
    </div>
    <div class="form-group" style="margin-left: 400px">
        <label class="control-label col-sm-3" for="pwd" style="color: white!important;max-width:14%">Password</label>
      <div class="col-sm-4">          
        <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="password">
      </div>
    </div>
    <div class="form-group" style="margin-left: 400px">        
      <div class="col-sm-7">
          <button type="submit" class="btn btn-primary" value="LOGIN" style="width:85px!important;height:35px!important;font-size:20px">Login</button>
      </div>
    </div>
  </form>
</div>
        
    </body>
</html>
