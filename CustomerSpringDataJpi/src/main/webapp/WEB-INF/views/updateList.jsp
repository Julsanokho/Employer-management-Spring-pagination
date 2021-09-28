<%@ include file ="../commande/header.jsp" %>
 <!--Show case-->
 <section class="bg-dark text-light p-5 p-lg-0 pt-lg-5 test-center text-em-start">
    <div class="container">
       <div class="d-sm-flex">
            <style>
		    body {
		            color: #566787;
		            background: #f5f5f5;
		            font-family: 'Varela Round', sans-serif;
		            font-size: 13px;
		        }
        </style>
   <section>
	   <div class="container">
		<div align="center" class="mt-4 mb-4">
			 
		</div>
		<div class="col-md-8 m-auto">
		   <div class="card">
			   <div class="card-body">
			        <form:form class="row g-3" method="post" action="/update-cosmetique?id=${cosmetique.id }" modelAttribute="cosmetique">
			            
			             <div class="col-md-6 mt-2">
							<form:label path="phoneNumber">phone Number</form:label>
							<form:input path="phoneNumber"  class="form-control" />
					    </div>
			            <div class="col-md-6 mt-2">
							<form:label path="address" >Address</form:label>
							<form:input path="address"  class="form-control" />
					    </div> 
					    <div class="col-md-6 mt-2">
							<form:label path="age" class="form-label">Age</form:label>
							<form:input path="age" class="form-control" />
					    </div>
					    <div class="col-md-6 mt-2">
							<form:label path="gender" class="form-label">Gender</form:label>
							<form:input path="gender" class="form-control" />
					    </div>
					    <div class="col-md-6 mt-2">
							<form:label path="name" class="form-label">Name</form:label>
							<form:input path="name" class="form-control" />
					    </div>
					    <div class="col-12 mt-2">
							<form:label path="planId" class="form-label">planId</form:label>
							<form:input path="planId" class="form-control" />
					    </div>
					    
			            <div class="col-12 mt-3">
			               <button onclick="return confirm('Are you sure!')" type="submit" class="btn btn-success">Save Change</button>
			            </div>
			        </form:form>
			   </div>
		   </div>
		   
		</div>
	</div>
</section>   
</div> 
</div>
</section>
<!-- News Letter-->
<dr/><br/>
<section class="bg-primary text-leght p-5">
   <div class="container">
   </div>
</section>

 <!-- FOOTER HERE -->
<%@ include file ="../commande/footer.jsp" %>