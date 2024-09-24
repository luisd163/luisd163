package co.edu.uniquindio.model;

import java.time.*;

public class Prestamo {

    LocalDate fechaPrestamo, fechaEntrega;
    String codigo;
    double total;

    public Prestamo (LocalDate fechaPrestamo, LocalDate fechaEntrega, String codigo, double total) {

        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
        this.codigo = codigo;
        this.total = total;

    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Prestamo [fechaPrestamo=" + fechaPrestamo + ", fechaEntrega=" + fechaEntrega + ", codigo=" + codigo
                + ", total=" + total + "]";
    }
    
}
