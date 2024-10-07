package model;

import java.util.LinkedList;// Paquete para crear listas


public class Prestamo {

    String codigo;
    Estudiante estudiante;
    Bibliotecario bibliotecario;
    String fechaPrestamo, FechaEntrega;
    LinkedList<DetallePrestamo> listaDetallePrestamos;
    LinkedList<Libro> listaLibrosPrestamo;

    /**
     * Método constructor de la clase Prestamo
     * @param codigo
     * @param estudiante
     * @param bibliotecario
     * @param totalAPagar
     * @param fechaPrestamo
     * @param fechaEntrega
     */
    public Prestamo (String codigo, Estudiante estudiante, Bibliotecario bibliotecario, String fechaPrestamo, String fechaEntrega) {

        this.codigo = codigo;
        this.estudiante = estudiante;
        this.bibliotecario = bibliotecario;
        this.fechaPrestamo = fechaPrestamo;
        this.FechaEntrega = fechaEntrega;
        listaDetallePrestamos = new LinkedList<>();
        listaLibrosPrestamo = new LinkedList<>();

    }

        // Métodos clase Prestamo //

        
    /**
     * Método que elimina un detallePrestamo
     * @param codigo  // Codigo del detallPrestamo a eliminar
     * @return false si no se pudo eliminar el prestamo, true si se elimino
     */
    public boolean eliminarDetallePrestamo(String codigo) {
        boolean verificar = false;
        for (DetallePrestamo detalle : listaDetallePrestamos) {
            if (detalle.getCodigo().equals(codigo)) {
                listaDetallePrestamos.remove(detalle);
                verificar = true;
                break;
            }
        }
        return verificar;
    }

    /**
     * Metodo para añadir un detalle prestamo
     * @param detallePrestamo 
     * @return false si no se pudo añadir prestamo, true si se añadio
     */
    public boolean añadirDetallePrestamo(Prestamo prestamo, DetallePrestamo detallePrestamo) {
        boolean verificar = false;
        prestamo.listaDetallePrestamos.add(detallePrestamo);
        verificar = true;
        return verificar;
    }
    

        // Setters y Getters

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaEntrega() {
        return FechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        FechaEntrega = fechaEntrega;
    }

    public LinkedList<DetallePrestamo> getListaDetallePrestamos() {
        return listaDetallePrestamos;
    }

    public void setListaDetallePrestamos(LinkedList<DetallePrestamo> listaDetallePrestamos) {
        this.listaDetallePrestamos = listaDetallePrestamos;
    }

    public LinkedList<Libro> getListaLibrosPrestamo() {
        return listaLibrosPrestamo;
    }

    public void setListaLibrosPrestamo(LinkedList<Libro> listaLibrosPrestamo) {
        this.listaLibrosPrestamo = listaLibrosPrestamo;
    }

    @Override
    public String toString() {
        return "Prestamo [codigo=" + codigo + ", estudiante=" + estudiante + ", bibliotecario=" + bibliotecario
                + ", fechaPrestamo=" + fechaPrestamo + ", FechaEntrega=" + FechaEntrega + ", listaDetallePrestamos="
                + listaDetallePrestamos + ", listaLibrosPrestamo=" + listaLibrosPrestamo + "]";
    }



    

}
