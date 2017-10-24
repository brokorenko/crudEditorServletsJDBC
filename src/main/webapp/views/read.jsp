<%--
  Created by IntelliJ IDEA.
  User: Андрей
  Date: 17.10.2017
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/read">
    <label>
        <input type="number" name="id">
    </label>
    <input type="submit" value="GetCar">
</form>
</body>
</html>
