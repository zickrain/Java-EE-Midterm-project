<%--
  Created by IntelliJ IDEA.
  User: Legion
  Date: 15.03.2021
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form class="login" action="LoginServlet" method="post">
    <input type="text" name="username" placeholder="name">

    <input type="password" name="password" placeholder="password">

    <hr>

    <button type="submit">Login</button>
    <h3> Don't have an account?</h3>
    <a href="register.jsp">Click here</a>
</form>

</body>
</html>
