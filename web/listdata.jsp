<%--
  Created by IntelliJ IDEA.
  User: 王炳智
  Date: 2017/8/30
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/form7.action" method="post">
    <%--list[0]:表示list集合中第一个user对象--%>
    username:<input type="text" name="list[0].username"/><br>
    password:<input type="text" name="list[0].password"/><br>
    address:<input type="text" name="list[0].address"/><br>
    username:<input type="text" name="list[1].username"/><br>
    password:<input type="text" name="list[1].password"/><br>
    address:<input type="text" name="list[1].address"/><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
