<%-- 
    Document   : frase
    Created on : 21 abr 2024, 0:36:28
    Author     : Luma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Paso de cadena</title>
    </head>
    <body>
        <% request.setCharacterEncoding("UTF-8"); %>
        Me gusta mucho comer
        <% out.print(request.getParameter("cadenaIntro"));%>
    </body>
</html>
