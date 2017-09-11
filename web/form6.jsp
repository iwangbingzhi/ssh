<%--
  Created by IntelliJ IDEA.
  User: 王炳智
  Date: 2017/8/30
  Time: 10:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--表达式封装--%>
<form action="${pageContext.request.contextPath}/form6.action" method="post">
    username:<input type="text" name="user.username"/><br>
    password:<input type="text" name="user.password"/><br>
    address:<input type="text" name="user.address"/><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
