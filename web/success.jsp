<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: wenbin
  Date: 2018/7/27
  Time: 21:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
success!!!!!<br>
Welcome!<s:property value="#session.LoginName"></s:property>
<a href="register.jsp">注册</a><br>
<a href="login.jsp">登陆</a><br>
<a href="update.jsp">更新</a>
</body>
</html>
