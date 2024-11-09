/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import modelo.OrdenTrabajo;
import conexion.ConexionDB;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/mostrarOrdenes")
public class MostrarOrdenesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<OrdenTrabajo> ordenes = new ArrayList<>();

        try (Connection conn = ConexionDB.getConnection()) {
            String query = "SELECT o.id_order, o.fecha, o.cliente, o.total, o.observaciones, t.descripcion AS tipoOrdenDescripcion " +
                           "FROM orden_de_trabajo o " +
                           "JOIN tipo_orden t ON o.tipo_orden_id_tipo = t.id_tipo";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                OrdenTrabajo orden = new OrdenTrabajo();
                orden.setIdOrder(rs.getInt("id_order"));
                orden.setFecha(rs.getString("fecha"));
                orden.setCliente(rs.getString("cliente"));
                orden.setTotal(rs.getInt("total"));
                orden.setObservaciones(rs.getString("observaciones"));
                orden.setTipoOrdenDescripcion(rs.getString("tipoOrdenDescripcion"));
                ordenes.add(orden);
            }

            request.setAttribute("ordenes", ordenes);
            RequestDispatcher dispatcher = request.getRequestDispatcher("mostrarOrdenes.jsp");
            dispatcher.forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error al obtener las órdenes de trabajo");
        }
    }
}


