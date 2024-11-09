/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import conexion.ConexionDB;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/registrarOrden")
public class RegistrarOrdenServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fecha = request.getParameter("fecha");
        String cliente = request.getParameter("cliente");
        int total = Integer.parseInt(request.getParameter("total"));
        String observaciones = request.getParameter("observaciones");
        int tipoOrdenIdTipo = Integer.parseInt(request.getParameter("tipoOrdenIdTipo"));

        try (Connection conn = ConexionDB.getConnection()) {
            String query = "INSERT INTO orden_de_trabajo (fecha, cliente, total, observaciones, tipo_orden_id_tipo) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, fecha);
            stmt.setString(2, cliente);
            stmt.setInt(3, total);
            stmt.setString(4, observaciones);
            stmt.setInt(5, tipoOrdenIdTipo);
            stmt.executeUpdate();
            response.sendRedirect("registroOrden.jsp?status=success");
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendRedirect("registroOrden.jsp?status=error");
        }
    }
}



