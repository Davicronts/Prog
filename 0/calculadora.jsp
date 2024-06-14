<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Calculadora JSP</title>
</head>
<body>
    <h1>Calculadora</h1>
    <form action="calculadora.jsp" method="post">
        <label for="numero1">Número 1:</label>
        <input type="text" id="numero1" name="numero1" required><br><br>

        <label for="numero2">Número 2:</label>
        <input type="text" id="numero2" name="numero2" required><br><br>

        <label for="operacion">Operación:</label>
        <select id="operacion" name="operacion" required>
            <option value="suma">Suma</option>
            <option value="resta">Resta</option>
            <option value="multiplicacion">Multiplicación</option>
            <option value="division">División</option>
        </select><br><br>

        <input type="submit" value="Calcular">
    </form>

<%
    // Verificar si hay datos del formulario enviados
    if (request.getMethod().equalsIgnoreCase("POST")) {
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
    }
%>
</body>
</html>
