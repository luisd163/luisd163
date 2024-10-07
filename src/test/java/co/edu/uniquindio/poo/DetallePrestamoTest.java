package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import model.DetallePrestamo;
import model.Libro;

public class DetallePrestamoTest {

    // Método que calcula el subtotal de un detallePrestamo
    @Test
    public void calcularSubTotalTest() {
        Libro libro1 = new Libro("!2344", "098765", "nuyguhoi", "j9ug8y7t", "khv ctu", "2000/09/02", 3, 1);
        DetallePrestamo detallePrestamo1 = new DetallePrestamo(40, libro1, "adf");

        assertEquals(40, detallePrestamo1.calcularSubTotal(detallePrestamo1.getCantidad(), detallePrestamo1.getLibro())); // El metodo funciona correctamente
    }
}
