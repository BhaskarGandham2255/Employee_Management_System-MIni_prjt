<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="EmployeeManagement.admin.AdminBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Panel</title>
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

<!-- Custom stylesheet -->
<style type="text/css">

  body {
    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    color: #333;
    margin: 0;
    padding: 0;
  }
  .header {
    background-color: rgba(52, 58, 64, 0.9);
    color: #fff;
    padding: 60px 0;
    text-align: center;
    border-bottom: 5px solid #007bff;
  }
  .header h1 {
    font-size: 3rem;
    margin: 0;
  }
  .header .s1-user-name {
    color: #ffc107;
  }
  .menu {
    margin: 40px auto;
    text-align: center;
  }
  .menu .btn {
    font-size: 1rem;
    padding: 12px 30px;
    margin: 0 20px;
    background: linear-gradient(45deg, #007bff, #0056b3);
    border: none;
    color: white;
    border-radius: 50px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
    transition: background 0.3s ease, transform 0.2s ease, box-shadow 0.3s ease;
  }
  .menu .btn-custom:hover {
    background: linear-gradient(45deg, #0056b3, #003d80);
    transform: scale(1.05);
    box-shadow: 0 6px 12px rgba(0, 0, 0, 0.3);
  }
  .btn-custom {
    background: linear-gradient(45deg, #007bff, #0056b3);
    border: none;
    color: white;
    border-radius: 50px;
  }
</style>
</head>
<body>
  <%
  AdminBean ab=(AdminBean)session.getAttribute("abean");%>
  <div class="header">
    <h1>Welcome Admin: <span class="s1-user-name fw-bolder text-capitalize"><%= ab.getUname() %></span></h1>
  </div>
  <div class="menu">
    <a href="viewAllEmployees" class="btn btn-custom ">View All Employees</a>
    <a href="addEmployee.html" class="btn btn-custom ">Add Employee</a>
    <a href="logoutAdmin" class="btn btn-custom ">Logout</a>
  </div>

  <script
    src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
    crossorigin="anonymous">
  </script>
</body>
</html>
