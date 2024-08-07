<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Invalid Admin</title>
<!-- custom css -->
<style>
   		.invalid-info
   		{
   		 top:90px;
   		}
   </style>
</head>
<body>
	<%String msg=(String)request.getAttribute("msg"); %>
    <% out.println(" <p class='invalid-info text-danger position-absolute left-50 fs-italic fw-bold'>"+msg+" details</p>"); %>

 	<%@include file="employeeLogin.html" %>
 	<!--  <script>
 	  alert("invalid userName / Password");
 	</script>-->
</body>
</html>