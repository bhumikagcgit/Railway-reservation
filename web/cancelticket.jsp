<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="adminlogin.css">
    </head>
    <body>
         <div  class="admin">
             <h1 style="margin-top: 100px; margin-left: 200px; color:  #ffccff;"> YOU CAN PRINT YOUR TICKETS HERE  BY ENTERING YOUR USERID </h1>
                                                                                                                                                                                                                                                                                                                                                                                                  <br>
         <br>
        <form class="form-horizontal"  action="canceltickactn.jsp" method="post">
    <div class="form-group" style="margin-left: 400px">
      <label class="control col-sm-3" style="color: white!important;max-width:14%">User Id</label>
      <div class="col-sm-4">
        <input class="form-control"  placeholder="Enter user id" name="USERID">
      </div>
    </div>
                 <br>
        <br>
  
              <div class="form-group" style="margin-left: 400px">
      <label class="control col-sm-3"  style="color: white!important;max-width:14%">DOJ:</label>
      <div class="col-sm-4">
          <input class="form-control"  type="date"   name="doj">
      </div>
    </div>
        <br>
        <br>
               <div class="form-group" style="margin-left: 400px">        
      <div class="col-sm-7">
          <button type="submit" class="btn btn-primary" value="submit" style="width:150px!important;height:35px!important;font-size:20px">SUBMIT</button>
      </div>
    </div>
  </form>
</div>
            
    </body>