<%--
  Created by IntelliJ IDEA.
  User: 王炳智
  Date: 2017/8/31
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
使用s：debug查看值栈的结构
<s:debug>

</s:debug>
&lt;%&ndash;
获取字符串
&ndash;%&gt;
<s:property value="username"/>

值栈中获取对象的值
<s:property value="user.username"/>
<s:property value="user.password"/>
<s:property value="user.address"/>



获取值栈list集合数据

第一种方式 获取list值 （会用)

<s:property value="list[0].username"/>
<s:property value="list[0].password"/>
<s:property value="list[0].address"/>


<s:property value="list[1].username"/>
<s:property value="list[1].password"/>
<s:property value="list[1].address"/>
<br/>


第二种方式 获取list值
<s:iterator value="list">
    <s:property value="username"/>
    <s:property value="password"/>
    <s:property value="address"/>
</s:iterator>
<br/>

第三种方式 获取list值（常用）
<s:iterator value="list" var="user">
    <s:property value="#user.username"/>
    <s:property value="#user.password"/>
    <s:property value="#user.address"/>
</s:iterator>
<br/>

使用set方法设置的值 根据名称获取值
<s:property value="name"/>
<br/>

使用push方法设置的值 利用数组的形式(了解)
<s:property value="[3].top"/><br/>
<s:property value="[2].top"/><br/>
<s:property value="[1].top"/><br/>
<s:property value="[0].top"/><br/>
<br/>
使用foreach标签+el表达式获取值栈list集合数据
<c:forEach items="${list}" var="user">
    ${user.username}
    ${user.password}
    ${user.address}

</c:forEach>
</body>
</html>
