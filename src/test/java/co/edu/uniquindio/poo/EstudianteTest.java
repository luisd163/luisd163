package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import model.Biblioteca;
import model.Estudiante;
import model.Prestamo;

public class EstudianteTest {

    // Método que agrega un prestamo a la lista de prestamos que tiene asignada un estudiante
    @Test
    public void agregarPrestamoEstudianteTest() {
        Biblioteca biblioteca = new Biblioteca("UQ");
        Estudiante estudiante1 = new Estudiante("Juan", "987656780", "098765432", "etryctvibo");
        Prestamo prestamo1 = new Prestamo("G59", null, null, "2024/09/5", "2024/09/10");
        biblioteca.crearPrestamo(prestamo1);
        biblioteca.crearEstudiante(estudiante1);

        assertEquals(true, estudiante1.agregarPrestamoEstudiante(prestamo1)); // se puede añadir correctamente un prestamo a un estudiante solo si no se agrego antes

        estudiante1.agregarPrestamoEstudiante(prestamo1);

        assertEquals(false, estudiante1.agregarPrestamoEstudiante(prestamo1)); // En el segundo caso no se puede agregar un prestamo que ya existe en la lista de prestamos del estudiante

        
    }

    // Método para eliminar un prestamo de un estudiante
    @Test
    public void eliminarPrestamoEstudiante() {
        Biblioteca biblioteca = new Biblioteca("UQ");
        Estudiante estudiante1 = new Estudiante("Juan", "987656780", "098765432", "etryctvibo");
        Prestamo prestamo1 = new Prestamo("G59", null, null, "2024/09/5", "2024/09/10");
        biblioteca.crearPrestamo(prestamo1);
        biblioteca.crearEstudiante(estudiante1);

        assertEquals(false, estudiante1.eliminarPrestamoEstudiante(prestamo1)); // Como el prestamo no existe no se puede eliminar

        estudiante1.agregarPrestamoEstudiante(prestamo1);

        assertEquals(true, estudiante1.eliminarPrestamoEstudiante(prestamo1)); // Como ya se encuentra el prestamo en la lista de prestamos del estudiante se pudo eliminar correctamente

    }
}
