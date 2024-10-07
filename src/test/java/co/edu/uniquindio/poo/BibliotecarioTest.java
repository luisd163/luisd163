package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import model.Biblioteca;
import model.Bibliotecario;
import model.Prestamo;

public class BibliotecarioTest {

    // Este método agrega un prestamo a la lista de prestamos que tiene un bibliotecario
    @Test
    public void agregarPrestamoBibliotecario() {
        Biblioteca biblioteca = new Biblioteca("UQ");
        Bibliotecario bibliotecario1 = new Bibliotecario("Pepe", "099664326576", "084671903", "plmjyghfd", 1000, 1);
        Prestamo prestamo1 = new Prestamo("G59", null, bibliotecario1, "2024/09/5", "2024/09/10");
        biblioteca.crearPrestamo(prestamo1);
        biblioteca.crearBibliotecario(bibliotecario1);

        assertEquals(true, bibliotecario1.agregarPrestamoBibliotecario(prestamo1)); // se puede añadir correctamente un prestamo a un bibliotecario solo si no se agrego antes

        bibliotecario1.agregarPrestamoBibliotecario(prestamo1);

        assertEquals(false, bibliotecario1.agregarPrestamoBibliotecario(prestamo1)); // No se puede agregar un prestamo que ya existe en la lista de prestamos del bibliotecario

    }

    // Método para eliminar un prestamo de un bibliotecario
    @Test
    public void eliminarPrestamoBibliotecarioTest() {
        Biblioteca biblioteca = new Biblioteca("UQ");
        Bibliotecario bibliotecario1 = new Bibliotecario("Pepe", "099664326576", "084671903", "plmjyghfd", 1000, 1);
        Prestamo prestamo1 = new Prestamo("G59", null, bibliotecario1, "2024/09/5", "2024/09/10");
        biblioteca.crearPrestamo(prestamo1);
        biblioteca.crearBibliotecario(bibliotecario1);

        assertEquals(false, bibliotecario1.eliminarPrestamoBibliotecario(prestamo1)); // No se elimina el prestamo debido a que no existe

        bibliotecario1.agregarPrestamoBibliotecario(prestamo1);

        assertEquals(true, bibliotecario1.eliminarPrestamoBibliotecario(prestamo1)); // Se elimina correctamente el prestamo debido a que ya esta añadido en la lista de prestamos del bibliotecario
        
    }
}
