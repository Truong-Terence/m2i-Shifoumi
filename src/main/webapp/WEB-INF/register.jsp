<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Register</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body>
<div class="container">

  <div class="col-6 offset-3">
    <h1>Register</h1>

    <form action="${pageContext.request.contextPath}/register" method="post">
      <div class="form-group mb-2">
        <label for="username">Username</label>
        <input type="text"
               class="${form_validation_error || duplicate_user_error ? 'form-control is-invalid' :'form-control'}"
               id="username"
               name="username" placeholder="Enter username" value="${username}">
        <c:choose>
          <c:when test="${form_validation_error}">
            <div class="invalid-feedback">Please enter a valid username.</div>
          </c:when>
          <c:when test="${duplicate_user_error}">
            <div class="invalid-feedback">This username already exists.</div>
          </c:when>
        </c:choose>
      </div>

      <div class="form-group mb-2">
        <label for="password">Password</label>
        <input type="password" class="${form_validation_error ? 'form-control is-invalid' :'form-control'}"
               id="password"
               name="password" placeholder="Enter Password">
        <div class="invalid-feedback">Please enter a valid password.</div>
      </div>
      <div class="form-group mb-2">
        <button type="submit" class="btn btn-primary">Sign up</button>
      </div>
    </form>
  </div>
</div>


</body>
</html>
