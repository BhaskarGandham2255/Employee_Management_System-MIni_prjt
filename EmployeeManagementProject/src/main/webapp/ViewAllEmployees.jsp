
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="EmployeeManagement.employee.EmployeeBean,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>view all employees</title>
<link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
      crossorigin="anonymous"
    />
    <link
      rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css"
    />
    
    
    <!-- custom style -->
    <style>
    .emp-table
    {
     width:1200px;
    }
    
    tr
    {
   		 text-align:center;
    }
    
    .table tr th,.table tr td
    {
    padding:15px;
    }
 
    </style>
</head>
<body>
	<%@include file="adminLogin.jsp" %>
	 <div class="data-table 
	 d-flex justify-content-center 
	 mt-4">
	   <div class="emp-table mt-2">
          <table class="table">
            <thead class="table-dark">
              <tr>
                <th scope="col">EID</th>
                <th scope="col">PASSWORD</th>
                <th scope="col">ENAME</th>
                <th scope="col">DEPT</th>
                <th scope="col">SAL</th>
                <th scope="col">EDIT</th>
                 <th scope="col">DELETE</th>
              </tr>
            </thead>
            <tbody>
              <%
              ArrayList<EmployeeBean> al=(ArrayList<EmployeeBean>) session.getAttribute("alist");
              Iterator<EmployeeBean> it=al.iterator();
              {
	             while(it.hasNext())
	              {
	            	EmployeeBean eb=(EmployeeBean)it.next();
              %>
            	  <tr>
	                  <td ><%= eb.getEid() %></td>
	                  <td ><%= eb.getPword() %></td>
	                  <td><%= eb.getEname() %></td>
	                  <td><%= eb.getDept()%></td>
	                  <td><%= eb.getSal()%></td>
	                  <td>
	                    <a href="editEmployee?eid=<%= eb.getEid() %>" >
	                    	<i class="bi bi-pencil-square fs-6"></i>
	                    </a>
	                  </td>
	                  <td>
	                    <a href="deleteEmployee?eid=<%= eb.getEid() %>">
	                    	<i class="bi bi-trash-fill"></i>
	                    </a>
	                 </td>
                  </tr> 
              <%
              	  }
              }
              %>
              
            </tbody>
          </table>
        </div>
       </div>
	
	<script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
      crossorigin="anonymous"
    >
    </script>
</body>
</html>