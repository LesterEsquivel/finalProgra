<%-- 
    Document   : mostrarOrdenes
    Created on : 9/11/2024, 8:20:30 a. m.
    Author     : Lester
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#">Ordenes</a>
        <div class="collapse navbar-collapse">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item"><a class="nav-link" href="registroOrden.jsp">Registrar Orden</a></li>
                <li class="nav-item"><a class="nav-link" href="mostrarOrdenes">Mostrar Ordenes</a></li>
            </ul>
        </div>
    </nav>
    <div class="container mt-5">
        <h2>Órdenes de Trabajo</h2>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Fecha</th>
                    <th>Cliente</th>
                    <th>Total</th>
                    <th>Observaciones</th>
                    <th>Tipo de Orden</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="orden" items="${ordenes}">
                    <tr>
                        <td>${orden.idOrder}</td>
                        <td>${orden.fecha}</td>
                        <td>${orden.cliente}</td>
                        <td>${orden.total}</td>
                        <td>${orden.observaciones}</td>
                        <td>${orden.tipoOrdenDescripcion}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
