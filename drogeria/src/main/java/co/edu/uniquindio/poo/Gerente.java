package co.edu.uniquindio.poo;

public class Gerente extends Empleado{

    public Gerente(String nombre, String apellidos, String dni, String direccion, String telefono, double salario) {
        super(nombre, apellidos, dni, direccion, telefono, salario);
        
    }

    public void agregarProducto(Drogeria drogeria, Producto producto){

        drogeria.agregarProducto(producto);
    }

    public void eliminarProducto(Drogeria drogeria, Producto producto){

        drogeria.eliminarProducto(producto);
    }

}
