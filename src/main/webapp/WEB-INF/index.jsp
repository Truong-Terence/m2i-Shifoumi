<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>JSP - Hello World</title>
</head>
    <body>
        <h1>Shifoumi</h1>
        <br/>
        <a href="/secured/play"><button type="button" class="btn btn-primary btn-lg">Play the game</button></a>
        <a href="${pageContext.request.contextPath}/secured/logout"><button type="button" class="btn btn-danger">Close Session</button></a>

<%--TODO Changer les routes | filtres--%>
    </body>
</html>