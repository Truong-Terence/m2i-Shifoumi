<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: tvnte
  Date: 14/04/2023
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/login" method="post">
        <label>
            <input type="text" name="username">
        </label>
        <label>
            <input type="password" name="password">
        </label>
        <button type="submit">Login</button>
    </form>

    <c:if test="${isError == true}">
        <p>Bad credentials.</p>
    </c:if>

</body>
</html>
