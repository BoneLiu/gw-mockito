<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: liuboen
  Date: 2017/2/9
  Time: 下午9:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>乱世三国</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="style/stylesheet.css"/>">
</head>
<body>
    <h1>欢迎光临</h1>
    <a href="<c:url value="/login"/>">登录</a>
    <a href="<c:url value="/register"/>">注册</a>
</body>
</html>
