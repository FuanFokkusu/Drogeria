package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Pedido {

    private LocalDate fecha;
    private int cantidad;
    private Producto producto;

    
    public Pedido(LocalDate fecha, int cantidad, Producto producto) {
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.producto = producto;
        assert producto.getStock() > 0;
    }


    public LocalDate getFecha() {
        return fecha;
    }


    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }


    public int getCantidad() {
        return cantidad;
    }


    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double calcularValorPedido (){
        return getCantidad() * producto.getPrecio();
    }

}
