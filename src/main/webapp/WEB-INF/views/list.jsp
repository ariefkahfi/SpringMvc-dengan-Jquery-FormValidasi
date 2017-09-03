<%@ taglib prefix="j" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Arief
  Date: 9/3/2017
  Time: 1:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List User</title>
</head>
<body>


    <table border="2">
        <tr>
            <td>Id</td>
            <td>Nama</td>
        </tr>
        <j:forEach var="u" items="${data}">
            <tr>
                <td>${u.id}</td>
                <td>${u.nama}</td>
            </tr>
        </j:forEach>
    </table>

</body>
</html>
