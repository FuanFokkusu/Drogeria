package co.edu.uniquindio.poo;

public class Gerente extends Empleado{

    public Gerente(String nombre, String apellidos, String dni, String direccion, String telefono, double salario) {
        super(nombre, apellidos, dni, direccion, telefono, salario);
        
    }

    public void agregarProducto( Producto producto){

        agregarProducto(producto);
    }

    public void eliminarProducto( Producto producto){

        eliminarProducto(producto);
    }

}
