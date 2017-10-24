<%--
  Created by IntelliJ IDEA.
  User: Андрей
  Date: 9/12/2017
  Time: 1:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/create">
    <label>
        Id:
        <input type="number" name="id" required>
    </label>
    <label>
        Brand:
        <input type="text" name="brand" required>
    </label>
    <label>
        Color:
        <input type="text" name="color" required>
    </label>
    <label>
        Model:
        <input type="text" name="model" required>
    </label>
    <input type="submit" value="CraeteCar">
</form>
</body>
</html>
