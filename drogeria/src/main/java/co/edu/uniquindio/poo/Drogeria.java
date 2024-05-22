package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

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
        return Collections.unmodifiableCollection(listaProductos);
    }


    public Collection<Cliente> getListaClientes() {
         return Collections.unmodifiableCollection(listaClientes);
    }

    public Collection<Empleado> getListaEmpleados() {
        return Collections.unmodifiableCollection(listaEmpleados);
    }


    public Collection<Pedido> getListaPedidos() {
        return Collections.unmodifiableCollection(listaPedidos);
    }

    public void agregarProducto (Producto producto){
        assert listaProductos != null;
        listaProductos.add(producto);
    }

    public void agregarPedido (Pedido pedido){
        assert listaPedidos != null;
        listaPedidos.add(pedido);
    }

    public void eliminarProducto(Producto producto){

        listaProductos.remove(producto);
    }

    public Collection <Producto> getProductoStock100 (){
        return listaProductos.stream().filter(producto -> producto.getStock() >= 100).toList();
    }



    }

