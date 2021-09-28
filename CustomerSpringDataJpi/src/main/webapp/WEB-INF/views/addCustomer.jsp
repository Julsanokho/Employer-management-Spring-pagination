<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" 
        rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" 
        crossorigin="anonymous">
<title>ADD CUSTOMER</title>
</head>
<body>
<section>
   <div class="container">
      <div class="rows mt-4 mb-5">
       <!-- ERROR MESSAGE -->
      <c:if test="${ errorMessage }">
      <div class="alert alert-danger d-flex align-items-center" role="alert">
           <svg class="bi flex-shrink-0 me-2" width="24" height="24" role="img" aria-label="Success:"><use xlink:href="#check-circle-fill"/></svg>
           <div>
                ${ errorMessage }
            </div>
        </div>
      </c:if>
            <div class="col-md-6 mt-5 mb-5 m-auto">
                <h4 style="text-align:center;" class="mt-5 mb-4"><b>Add New CUSTOMER On The CUSTOMER List</b></h4>
			     <div class="card">
			        <div class="card-body">
			            <form action="/save-customer" method="post" modelAttribute="customer">
			             <div class="form-group">
			                  <label class="control-label" for="phoneNumber">PHONE NUMBER</label>
			                  <input type="text" name="phoneNumber" id="phoneNumber" value="${ phoneNumber }" class="form-control" placeholder="Enter Your phoneNumber Here"  required="required"/>
			             </div>
			             <div class="form-group">
			                  <label class="control-label" for="address">ADDRESS</label>
			                  <input type="text" name="address" id="address" value="${ address }" class="form-control" placeholder="Enter Your address Here" required="required"/>
			             </div>
			             <div class="form-group">
			                  <label class="control-label" for="age">AGE</label>
			                  <input type="text" name="age" id="age" value="${ age }" class="form-control" placeholder="Enter Your age Here" required="required"/>
			             </div>
			             <div class="form-group">
			                  <label class="control-label" for="gender">GENDER</label>
			                  <input type="text" name="gender" id="gender" value="${ gender }" class="form-control" placeholder="Enter Your gender Here" required="required"/>
			             </div>
			             <div class="form-group">
			                  <label class="control-label" for="name">NAME</label>
			                  <input type="text" name="name" id="name" value="${ name }" class="form-control" placeholder="Enter Your name Here" required="required"/>
			             </div>
			             <div class="form-group">
			                  <label class="control-label" for="planId">PLAN ID</label>
			                  <input type="text" name="planId" id="planId" value="${ planId }" class="form-control" placeholder="Enter Your planId Here" required="required"/>
			             </div>
			             <div class="form-group">
			                 <button type="submit" class="btn btn-success"><b>SAVE</b></button>
			             </div>
			           </form>
			        </div>
			     </div>
			     <div>
                <button type="submit" class="btn btn-dark mt-5">
                <a href="list-customer" class="">
                <b> Back To CUSTOMER List</b>
                </a></button>
                </div>
             <div>
        </div> 
        <hr>
    </div>
 
</section>

<!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js" integrity="sha384-W8fXfP3gkOKtndU4JGtKDvXbO53Wy8SZCQHczT5FMiiqmQfUpWbYdTil/SxwZgAN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.min.js" integrity="sha384-skAcpIdS7UcVUC05LJ9Dxay8AXcDYfBJqt1CJ85S/CFujBsIzCIv+l9liuYLaMQ/" crossorigin="anonymous"></script>
            
</body>
</html>