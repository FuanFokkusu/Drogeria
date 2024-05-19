package co.edu.uniquindio.poo;

public abstract class Producto {

    private String codigoProducto;
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;
    private String proveedor;


    public Producto(String codigoProducto, String nombre, String descripcion, double precio, int stock,
            String proveedor) {
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.proveedor = proveedor;
    }


    public String getCodigoProducto() {
        return codigoProducto;
    }


    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public double getPrecio() {
        return precio;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public int getStock() {
        return stock;
    }


    public void setStock(int stock) {
        this.stock = stock;
    }


    public String getProveedor() {
        return proveedor;
    }


    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    
}
