<%--
  Created by IntelliJ IDEA.
  User: liuboen
  Date: 2017/2/11
  Time: 下午1:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>乱世三国</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="style/stylesheet.css"/>">
</head>
<body>
<c:forEach item="${heroesList}" var="heroes">
    <ul id="hero_<c:out value="${heroes.id}"/>">
                    <c:out value="${heroes.time}"/>
    </ul>
</c:forEach>
</body>
</html>
