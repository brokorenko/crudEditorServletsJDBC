<%--
  Created by IntelliJ IDEA.
  User: Андрей
  Date: 9/11/2017
  Time: 12:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${t}</title>
</head>
<body>
${x}
<a href="${pageContext.request.contextPath}/create">create</a>
<a href="${pageContext.request.contextPath}/read">read</a>
<a href="${pageContext.request.contextPath}/update">update</a>
<a href="${pageContext.request.contextPath}/delete">delete</a>
<%--<form name="create" action="createaction" method="post">
    <input type="submit" name="button" value="create entry"/>
</form>
<form name="create" action="removeaction" method="post">
    <input type="submit" name="button" value="remove entry"/>
</form>
<form name="create" action="updateaction" method="post">
    <input type="submit" name="button" value="update entry"/>
</form>
<form name="create" action="deleteaction" method="post">
    <input type="submit" name="button" value="delete entry"/>
</form>--%>
</body>
</html>
