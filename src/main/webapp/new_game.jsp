<%--
  Created by IntelliJ IDEA.
  User: Iskander
  Date: 15.03.2021
  Time: 18:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3> Create New Game </h3>
<a href="LogoutServlet">Logout</a>
<a href="UserGameListServlet">View My Notes</a>
<a href="account.jsp" class="navbar-brand">Dashboard</a>
<form action="NewGameServlet" method="post" align="center">
    <label >Note Title</label>
    <input type="text" placeholder="Enter the title" name="title"><br>
    <label ><abbr title="target price">Target price</abbr></label>
    <input type="text" placeholder="Price" name="price"><br>
    <label >Note status</label>
    <input type="text" placeholder="false or true" name="description" ><br>
    <button type="submit" name="action" value="update">Add</button>
    <br>
    <p><c:out value="${message}"/></p>
</form>
</body>
</html>
