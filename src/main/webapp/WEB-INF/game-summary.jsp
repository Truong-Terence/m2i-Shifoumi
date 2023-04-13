<%--
  Created by IntelliJ IDEA.
  User: tvnte
  Date: 13/04/2023
  Time: 11:57
  To change this template use File | Settings | File Templates.
--%>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
Ce que l’utilisateur a joué
o Ce que le serveur a joué
o D’un message affichant qui a gagné
o D’un bouton rejouer pour relancer le jeu
--%>
<h1>GAME SUMMARY</h1>
<a href="home">Back to menu</a>
<a href="play">Play again</a>

<p>You played ${choice}</p>
</body>
</html>
