<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de Personas</title>
    </head>
    <body>
        
        <h1>Listado de Personas</h1>
        
        <table border="1">
            <tr>
                <th>Id Persona</th>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Email</th>
                <th>Teléfono</th>
                <th>Editar</th>
                <th>Eliminar</th>
                
            </tr>
            <c:forEach var="persona" items="${personas}" >
                <tr>
                    <td>${persona.idPersona}</td>
                    <td>${persona.nombre}</td>
                    <td>${persona.apellido}</td>
                    <td>${persona.email}</td>
                    <td>${persona.telefono}</td>
                    <td> <a href="${pageContext.request.contextPath}/r2d2/modificar?idPersona=${persona.idPersona}"> editar </a> </td>
                    <td> <a href="${pageContext.request.contextPath}/r2d2/eliminar?idPersona=${persona.idPersona}" 
                            onclick="if(!confirm('¿Realmente desea eliminiar el registro?')) return false "> eliminar </a> </td>
                </tr>
            </c:forEach>
        </table>
        <br/>
        <input type="button" value="Agregar Persona" onclick="window.location.href='agregar'; return false;"/>
    </body>
</html>
