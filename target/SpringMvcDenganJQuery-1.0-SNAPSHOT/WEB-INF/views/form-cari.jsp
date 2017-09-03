<%@ taglib prefix="springForm" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Arief
  Date: 9/3/2017
  Time: 12:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form Cari User</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>


<body>

    <form id="form-cari"  method="POST">
        <table>
            <tr>
                <td>Id User</td>
                <td><input type="number" id="idUser"/></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td><input type="submit" value="Cari user"/></td>
            </tr>
        </table>
    </form>

</body>

    <script>
        $(document).ready(function(){

           $('form').submit(function(){

               var idUser = $('#idUser').val();

               if(isNaN(idUser)){
                   alert('Maaf field user harus valid');
               }else{
                   $('#form-cari').attr('action','cari-user/'+idUser.toString());
               }



               event.preventDefault();
           });


        });
    </script>

</html>
