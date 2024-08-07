<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" 
    import="EmployeeManagement.employee.EmployeeBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit employee</title>
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
    <!--custom stylesheet -->
    <style>
      *{
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}

.html-body {
    height: 100vh;
    display: flex;
    justify-content: center;
    align-items: center;
  }

  .login-container
  {
    height: 550px;
    border-radius: 15px;
    box-shadow: 0 0 10px silver;
  }

    </style>
<body class="html-body container-fluid bg-light">
	  <%
	  EmployeeBean eb=(EmployeeBean)request.getAttribute("eb");
	  %>
  
    <!-- login box -->
    <div class="login-container border border-1 p-5 w-25 bg-white">
    
      <form action="editEmployeeDetails" method="post">
        <div class="text-center">
          <h3 class="fs-2 text-Upp fw-bolder">Edit Employee</h3>
        </div>

        <div class="">
          <input type="hidden" name="eid" id="eid" value="<%=eb.getEid() %>" class="form-control" />
        </div>

        <div class="mt-3 pt-0">
          <label for="ename" class="form-label fw-bold text-dark-emphasis">Employee Name </label>
          <input type="text" name="ename" id="ename" value="<%=eb.getEname() %>" class="form-control" />
        </div>

        <div class="mt-3 pt-0">
          <label for="dept" class="form-label fw-bold text-dark-emphasis">Department </label>
          <input type="text" name="dept" id="dept" value="<%=eb.getDept() %>" class="form-control" />
        </div>

        <div class="mt-3 pt-0">
          <label for="sal" class="form-label fw-bold text-dark-emphasis">Salary </label>
          <input type="text" name="sal" id="sal" value="<%=eb.getSal() %>" class="form-control" />
        </div>

        <div class="mt-3 pt-0">
          <label for="dept" class="form-label fw-bold text-dark-emphasis">Password </label>
          <input type="text" name="dept" id="dept" value="<%=eb.getPword() %>" class="form-control" />
        </div>

        <div class="mt-4 text-center">
          <input
            type="submit"
            value="Edit Employee"
            class="btn btn-primary  w-75 text-center"
          />
        </div>

      </form>
    </div>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
      crossorigin="anonymous"
    ></script>
</body>
</html>