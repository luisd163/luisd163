package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import model.Biblioteca;
import model.Bibliotecario;
import model.DetallePrestamo;
import model.Estudiante;
import model.Libro;
import model.Prestamo;

public class PrestamoTest {

    // Método para añadir un detallePrestamo a un prestamo
    @Test
    public void añadirDetallePrestamoTest() {
        Biblioteca biblioteca = new Biblioteca("UQ");
        Estudiante estudiante1 = new Estudiante("Juan", "123456789", "098765432", "etryctvibo");
        Bibliotecario bibliotecario1 = new Bibliotecario("Pepe", "099664326576", "084671903", "plmjyghfd", 1000, 1);
        Libro libro1 = new Libro("098", "1234", "luis", "thewitcher", "fomf2p", "1982/07/16", 5, 1);
        biblioteca.crearEstudiante(estudiante1);
        biblioteca.crearBibliotecario(bibliotecario1);
        biblioteca.crearLibro(libro1);
        Prestamo prestamo1 = new Prestamo("G59", estudiante1, bibliotecario1, "2024/09/5", "2024/09/10");
        DetallePrestamo detallePrestamo1 = new DetallePrestamo(1, libro1, "986");

        assertEquals(true, prestamo1.añadirDetallePrestamo(prestamo1, detallePrestamo1));

        // Se agrega correctamente un detallePrestamo a un prestamo
    }

    // Método para eliminar un detallePrestamo de un prestamo
    @Test
    public void eliminarDetallePrestamoTest() {
        Biblioteca biblioteca = new Biblioteca("UQ");
        Estudiante estudiante1 = new Estudiante("Juan", "123456789", "098765432", "etryctvibo");
        Bibliotecario bibliotecario1 = new Bibliotecario("Pepe", "099664326576", "084671903", "plmjyghfd", 1000, 1);
        Libro libro1 = new Libro("098", "1234", "luis", "thewitcher", "fomf2p", "1982/07/16", 5, 1);
        biblioteca.crearEstudiante(estudiante1);
        biblioteca.crearBibliotecario(bibliotecario1);
        biblioteca.crearLibro(libro1);
        Prestamo prestamo1 = new Prestamo("G59", estudiante1, bibliotecario1, "2024/09/5", "2024/09/10");
        DetallePrestamo detallePrestamo1 = new DetallePrestamo(1, libro1, "000");
        biblioteca.crearPrestamo(prestamo1);
        prestamo1.añadirDetallePrestamo(prestamo1, detallePrestamo1);

        assertEquals(true, prestamo1.eliminarDetallePrestamo("000"));

        // Se elimina correctamente un detallePrestamo a un prestamo
    }
}

