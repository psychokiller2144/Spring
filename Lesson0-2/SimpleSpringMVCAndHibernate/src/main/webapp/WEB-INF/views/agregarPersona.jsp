
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Persona</title>
    </head>
    <body>
        <h1>Agregar Persona</h1>
        
        <form:form action="agregarPersona" modelAttribute="persona" method="POST">
            <form:hidden path="idPersona"/>
            
            <table> 
                <tr>
                    <td>Nombre: </td>
                    <td> <form:input path="nombre"/> </td>
                </tr>
                
                <tr>
                    <td>Apellido: </td>
                    <td> <form:input path="apellido"/> </td>
                </tr>
                
                <tr>
                    <td> Email:</td>
                    <td> <form:input path="email"/> </td>
                </tr>
                
                <tr>
                    <td> Telefono: </td>
                    <td> <form:input path="telefono"/></td>
                </tr>
                
                <tr>
                    <td colspan="2"> <input type="submit" value="Agregar"/> </td>
                </tr>
            </table>
        </form:form>
        
    </body>
</html>
