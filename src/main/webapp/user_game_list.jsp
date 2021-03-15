<%--
  Created by IntelliJ IDEA.
  User: Iskander
  Date: 15.03.2021
  Time: 18:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="account.jsp" class="navbar-brand">Dashboard</a>
<a href="UserGameListServlet">View My Notes</a>
<a href="LogoutServlet">Logout</a>
<div class="text-left">
    <a href="new_game.jsp"
       class="btn btn-success">Add Note</a>
</div>
<table class="table table-striped">
    <thead>
    <tr>
        <th>Note Id</th>
        <th>Note title</th>
        <th>Note target date</th>
        <th>Note status</th>
        <th>Actions</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="game" items="${game_list}">
        <tr>
            <td><c:out value="${game.title}"/></td>
            <td><c:out value="${game.price}"/></td>
            <td><c:out value="${game.description}"/></td>
        </tr>

    </c:forEach>
    </tbody>
</table>
</body>
</html>
