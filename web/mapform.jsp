<%--
  Created by IntelliJ IDEA.
  User: 王炳智
  Date: 2017/8/30
  Time: 11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/mapaction.action" method="post">
  <%--  设置key的值 map["key值"]
    设置value的值--%>

    username:<input type="text" name="map['one'].username"/><br>
    password:<input type="text" name="map['one'].password"/><br>
    address:<input type="text" name="map['one'].address"/><br>
    username:<input type="text" name="map['two'].username"/><br>
    password:<input type="text" name="map['two'].password"/><br>
    address:<input type="text" name="map['two'].address"/><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
