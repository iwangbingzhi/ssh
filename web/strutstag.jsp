<%--
  Created by IntelliJ IDEA.
  User: 王炳智
  Date: 2017/9/9
  Time: 12:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--form标签--%>
    <s:form>
        <s:textfield name="username" label="username"> </s:textfield>
        <s:password name="password" label="password"> </s:password>
        <%--<s:radio list="{'女','男'}" name="sex" label="性别"> </s:radio>--%>
        <s:radio list="#{'nv':'女','nan':'男'}" name="sex1" label="性别"> </s:radio>


        <%--复选框--%>
        <s:checkboxlist list="{'羽毛球','足球','吃饭'}" name="love" label="爱好"> </s:checkboxlist>
        <%--下拉输入框--%>
        <s:select list="{'川大','科大','交大'}" name="college" label="学校"> </s:select>

        <s:file name="file" label="上传文件"> </s:file>

        <%--隐藏项--%>
        <s:hidden name="hid" value="abcd"> </s:hidden>

        <%--文本域--%>
        <s:textarea name="resume" label="简历" rows="3" cols="3"> </s:textarea>
        <%--提交只有submit,没有image,button--%>
        <s:submit value="提交"> </s:submit>
        <%--重置--%>
        <s:reset value="重置"> </s:reset>
    </s:form>
</body>
</html>
