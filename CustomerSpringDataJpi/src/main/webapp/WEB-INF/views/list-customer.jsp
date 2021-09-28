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
<title>LIST CUSTOMER</title>
</head>
<body>
   <nav class="navbar navbar-expand-md navbar-dark bg-info">
    <a class="navbar-brand" href="/"><b>Customer App</b></a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbar" aria-controls="navbar"
            aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <!-- <div class="collapse navbar-collapse" id="navbar">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="/">Home</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/contact">Contact Us</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/about">About Us</a>
            </li>
             <li class="nav-item">
                <a class="nav-link" href="/todo-list">Todo List</a>
            </li>
        </ul> -->
        <!-- Nav Bar Right -->
<ul class="navbar-nav ml-auto">
    <li class="nav-item">
        <span class="nav-link"> <b>Hi, <c:out value="${username }"/></b></span>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Log Out</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/login">Sign In</a>
            </li>
        </ul>
    </div>
</nav>

<!-- Content Section -->
<section>
<div class="container">
    <div class="rows mt-4 mb-5">
         <div class="col-sm-6">
               <a href="/customer-form" class="btn btn-success">
               <i class="material-icons">&#xE147;
               </i> <span>Add New Customer</span></a>
          </div>
         <div class="mt-4 mb-4">
               <table class="table mt-4 mb-4">
               <thead>
                 <tr class="table-danger">
			      <th scope="col">MOBILE</th>
			      <th scope="col">ADDRESS</th>
			      <th scope="col">AGE</th>
			      <th scope="col">GENDER</th>
			      <th scope="col">NAME</th>
			      <th scope="col">PLAN ID</th>
			      <th scope="col">EDIT</th>
			      <th scope="col">DELETE ID</th> 
			   </tr>
                </thead>
               <tbody>
                   <c:forEach items ="${listCustomer}" var="customer">
			    <tr>
			      <td class="bg-secondery" scope="row">${customer.phoneNumber }</td>
			      <td>${customer.address}</td>
			      <td>${customer.age}</td>
			      <td>${customer.gender }</td>
			      <td>${customer.name }</td>
			      <td>${customer.planId}</td>
			      <td>
				       <a href="/update-customer?id=${ customer.phoneNumber }" 
					       class="edit btn btn-secondary">
					       <i class="material-icons" 
					       data-toggle="tooltip" 
					       title="Edit">&#xE254;</i>
				       </a>
				   </td>
				   <td>    
				       <a href="/delete-customer?id=${customer.phoneNumber}" 
					       onclick="return confirm('Are you sure?')" 
					       class="delete btn btn-danger ml-2">
					       <i class="material-icons" 
					       data-toggle="tooltip" 
					       title="Delete">&#xE872;</i>
				       </a>
			      </td>
			    </tr>
			 
              </c:forEach>
           </tbody>
         </table>  
        </div>
    </div>
    <hr> 
</div>

</section>

<!-- FOOTER HERE -->

<footer class="bg-light text-center text-lg-start mt-4">
  <!-- Grid container -->
  <div class="container p-4">
    <!--Grid row-->
    <div class="row">
      <!--Grid column-->
      <div class="col-lg-6 col-md-12 mb-4 mb-md-0">
        <h5 class="text-uppercase">Footer text</h5>

        <p>
          Lorem ipsum dolor sit amet consectetur, adipisicing elit. Iste atque ea quis
          molestias. Fugiat pariatur maxime quis culpa corporis vitae repudiandae
          aliquam voluptatem veniam, est atque cumque eum delectus sint!
        </p>
      </div>
      <!--Grid column-->

      <!--Grid column-->
      <div class="col-lg-6 col-md-12 mb-4 mb-md-0">
        <h5 class="text-uppercase">Footer text</h5>

        <p>
          Lorem ipsum dolor sit amet consectetur, adipisicing elit. Iste atque ea quis
          molestias. Fugiat pariatur maxime quis culpa corporis vitae repudiandae
          aliquam voluptatem veniam, est atque cumque eum delectus sint!
        </p>
      </div>
      <!--Grid column-->
    </div>
    <!--Grid row-->
  </div>
  <!-- Grid container -->

  <!-- Copyright -->
  <div class="text-center p-3" style="background-color: rgba(0, 0, 0, 0.2);">
   
    <a class="text-dark" href="#"></a>
  </div>
  <!-- Copyright -->
</footer>

</body>
</html>