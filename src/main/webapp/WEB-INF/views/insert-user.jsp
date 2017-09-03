<%@ taglib prefix="springForm" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Arief
  Date: 9/3/2017
  Time: 12:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form Insert User</title>
</head>
<body>

    <springForm:form modelAttribute="user" action="form-insert" method="POST">
        <table>
            <tr>
                <td>Id</td>
                <td><springForm:input path="id"/></td>
                <td><springForm:errors path="id"/></td>
            </tr>
            <tr>
                <td>Nama</td>
                <td><springForm:input path="nama"/></td>
                <td><springForm:errors path="nama"/></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td><input type="submit" value="Insert User"/></td>
            </tr>
        </table>
    </springForm:form>


</body>

</html>
