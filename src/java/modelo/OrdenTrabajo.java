/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class OrdenTrabajo {
    private int idOrder;
    private String fecha;
    private String cliente;
    private int total;
    private String observaciones;
    private int tipoOrdenIdTipo;
    private String tipoOrdenDescripcion;

    // Getters y Setters
    public int getIdOrder() { return idOrder; }
    public void setIdOrder(int idOrder) { this.idOrder = idOrder; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public String getCliente() { return cliente; }
    public void setCliente(String cliente) { this.cliente = cliente; }

    public int getTotal() { return total; }
    public void setTotal(int total) { this.total = total; }

    public String getObservaciones() { return observaciones; }
    public void setObservaciones(String observaciones) { this.observaciones = observaciones; }

    public int getTipoOrdenIdTipo() { return tipoOrdenIdTipo; }
    public void setTipoOrdenIdTipo(int tipoOrdenIdTipo) { this.tipoOrdenIdTipo = tipoOrdenIdTipo; }

    public String getTipoOrdenDescripcion() { return tipoOrdenDescripcion; }
    public void setTipoOrdenDescripcion(String tipoOrdenDescripcion) { this.tipoOrdenDescripcion = tipoOrdenDescripcion; }
}


