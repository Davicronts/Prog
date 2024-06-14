<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Resultado de la Calculadora</title>
</head>
<body>
    <h1>Resultado</h1>
<%
    try {
        double numero1 = Double.parseDouble(request.getParameter("numero1"));
        double numero2 = Double.parseDouble(request.getParameter("numero2"));
        String operacion = request.getParameter("operacion");

        double resultado = 0;

        switch (operacion) {
            case "suma":
                resultado = numero1 + numero2;
                break;
            case "resta":
                resultado = numero1 - numero2;
                break;
            case "multiplicacion":
                resultado = numero1 * numero2;
                break;
            case "division":
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    out.println("<p style='color:red;'>Error: División por cero</p>");
                    return;
                }
                break;
            default:
                out.println("<p style='color:red;'>Operación no válida</p>");
                return;
        }

        out.println("<p>El resultado de la " + operacion + " es: " + resultado + "</p>");
    } catch (NumberFormatException e) {
        out.println("<p style='color:red;'>Error: Por favor, introduce números válidos</p>");
    }
%>
    <a href="index.jsp">Volver</a>
</body>
</html>
