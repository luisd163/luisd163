package model;

public class DetallePrestamo {

    int cantidad;
    Libro libro;
    double subTotal;
    String codigo;

    /**
     * Método constructor de la clase DetallePrestamo
     * @param cantidad
     * @param libro
     */
    public DetallePrestamo(int cantidad, Libro libro, String codigo) {
        this.cantidad = cantidad;
        this.libro = libro;
        this.codigo = codigo;
        this.subTotal = calcularSubTotal(cantidad, libro);
    }

        // Métodos clase DetallePrestamo //


    /**
     * Método para calcular el subTotal de un libro
     * @param cantidad
     * @param libro
     * @return double con el subTotal
     */
    public double calcularSubTotal(int cantidad, Libro libro) {
        double subTotal = cantidad * libro.getPrecio();
        return subTotal;
    }

    // Setters y Getters

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    // toString clase DetallePrestamo
    @Override
    public String toString() {
        return "DetallePrestamo [cantidad=" + cantidad + ", libro=" + libro + ", subTotal=" + subTotal + ", codigo="
                + codigo + "]";
    }



}