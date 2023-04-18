<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Profil</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
  <script src="https://kit.fontawesome.com/d43c0bef8d.js" crossorigin="anonymous"></script>
</head>

<c:import url="header.jsp"></c:import>

<div class="container">
  <div class="col-8 offset-2">
    <h1>Your profil</h1>
    <div class="row d-flex justify-content-center">
        <p class="text-muted mb-0">${user.username}</p>
    </div>
  </div>
</div>

</body>
</html>