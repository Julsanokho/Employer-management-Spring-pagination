<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <link rel="stylesheet" href="/css/fil.css">
<title>Login</title>
</head>
<body>
   <form action="/login" method="post" class="formcontainer">
    <p class="nav-item">
	  <a class="nav-link" href="/login">Sign In</a>
    </p>
  <div class="imgcontainer">
    <img src="/css/logo.jpg" alt="Avatar" class="avatar">
  </div>

  <div class="container">
    <p >
    <label for="username"><b>User name</b></label>
    <input type="text" placeholder="Enter Username" name="username" required>
    </p>
    <p>
    <label for="password"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>
    </p>
     <p class = "btnsubmit">
    <button type="submit">Login</button>
    <p>
    <div class="bntremember">
	    <label>
	      <input type="checkbox" checked="checked" name="remember"> Remember me
	    </label>
    </div>
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="password">Forgot <a href="#">password?</a></span>
  </div>
</form>
</body>
</html>