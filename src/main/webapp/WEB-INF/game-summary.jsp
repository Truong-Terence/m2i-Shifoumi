<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
o D’un message affichant qui a gagné
o D’un bouton rejouer pour relancer le jeu
--%>
<h1>GAME SUMMARY</h1>
<a href="/"><button type="button" class="btn btn-primary">Back to menu</button></a>
<a href="/secured/play"><button type="button" class="btn btn-warning">Play again</button></a>

<p>${pChoice} vs ${sChoice}</p>
<p>${result} !</p>

</body>
</html>
