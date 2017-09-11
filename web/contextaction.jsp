<%--
  Created by IntelliJ IDEA.
  User: 王炳智
  Date: 2017/9/7
  Time: 12:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--获取context里面的数据，写ognl的时候，首先添加符号
#context的key名称，域对象名称--%>
<s:property value="#request.req"/><br/>

<s:textfield name="username" value="%{#request.req}"/>
</body>
</html>
