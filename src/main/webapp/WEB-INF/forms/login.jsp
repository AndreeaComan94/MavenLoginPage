<%--
  Created by IntelliJ IDEA.
  User: UserA
  Date: 7/1/2015
  Time: 1:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
  <meta charset="US-ASCII">
  <title>Login Page</title>
</head>
<body>
<form action="LoginServlet" method="post">
  Username: <input type="text" name="username">
  Password: <input type="password" name="password">
  <br>
  <input type="submit" value="Login">
</form>
</body>
</html>
