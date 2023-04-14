<%--
  Created by IntelliJ IDEA.
  User: tvnte
  Date: 13/04/2023
  Time: 11:56
  To change this template use File | Settings | File Templates.
--%>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Game</title>
</head>
<body>
<h1>Here is the GAME</h1>
<a href="home">Back to menu</a>

<div class="container">
    <form method="post" action="play">
        <button type="submit" value="SHI" name="player-choice" class="btn btn-primary">SHI</button>
        <button type="submit" value="FOU" name="player-choice" class="btn btn-secondary">FOU</button>
        <button type="submit" value="MI" name="player-choice" class="btn btn-danger">MI</button>
    </form>
</div>
</body>
</html>
