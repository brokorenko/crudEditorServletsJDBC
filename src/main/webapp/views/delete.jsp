<%--
  Created by IntelliJ IDEA.
  User: Андрей
  Date: 9/12/2017
  Time: 1:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/delete">
    <label>
        <input type="number" name="id">
    </label>
    <input type="submit" value="DeleteCar">
</form>
</body>
</html>
