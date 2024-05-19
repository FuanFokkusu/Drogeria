package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Drogeria {

    private String nombre;
    private Collection<Producto> listaProductos;
    private Collection <Cliente> listaClientes;
    private Collection <Empleado> listaEmpleados;
    private Collection <Pedido> listaPedidos;



    public Drogeria(String nombre) {
                        
        this.nombre = nombre;
        this.listaProductos = new LinkedList<>();
        this.listaClientes = new LinkedList<>();
        this.listaEmpleados = new LinkedList<>();
        this.listaPedidos = new LinkedList<>();
    }



    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public Collection<Producto> getListaProductos() {
        return listaProductos;
    }



    public void setListaProductos(Collection<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }



    public Collection<Cliente> getListaClientes() {
        return listaClientes;
    }



    public void setListaClientes(Collection<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }



    public Collection<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }



    public void setListaEmpleados(Collection<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }



    public Collection<Pedido> getListaPedidos() {
        return listaPedidos;
    }



    public void setListaPedidos(Collection<Pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    public void agregarProducto(Producto producto){

        if (producto.getStock() == 0) {

            System.out.println("EL PRODUCTO NO SE ENCUENTRA EN STOCK");
            
        }

        listaProductos.add(producto);
    }

    public void eliminarProducto(Producto producto){

        listaProductos.remove(producto);
    }
}
