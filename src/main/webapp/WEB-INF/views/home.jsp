<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Home JSP</title>
</head>

    <style>
        a{
            display: block;
            margin-bottom : 10px;
        }
    </style>

<body>

    <c:set var="contextPath" value="${pageContext.request.contextPath}"/>

    <a href="${contextPath}/user/form-insert">Form User</a>
    <a href="${contextPath}/user/cari-user">Cari User</a>
    <a href="${contextPath}/user/list-user">List User</a>

</body>


</html>
