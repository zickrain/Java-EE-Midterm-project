<%--
  Created by IntelliJ IDEA.
  User: Legion
  Date: 15.03.2021
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form class="login" action="RegisterServlet" method="post">
    <div class="container">
        <input type="text" name="username" placeholder="name">
        <br>
        <input type="password" name="password" placeholder="password">
        <br>
        <input type="password" name="confirm_password" placeholder="confirm_password">
        <hr>
        <button type="submit">Register</button>
        <h3> Have an account?</h3>
        <a href="LoginServlet">Click here</a>
    </div>

</form>

</body>
</html>
