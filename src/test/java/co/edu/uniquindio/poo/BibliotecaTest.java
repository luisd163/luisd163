package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import model.Biblioteca;
import model.Bibliotecario;
import model.Estudiante;
import model.Libro;
import model.Prestamo;

public class BibliotecaTest {

    /**
     * Método que crea un estudiante
     */
    @Test
    public void crearEstudianteTest() {
        Biblioteca biblioteca = new Biblioteca("UQ");
        Estudiante estudiante1 = new Estudiante("Juan", "2345678", "098765432", "juan@uqvirtual.edu.co");

        assertEquals(true, biblioteca.crearEstudiante(estudiante1)); // Se creo correctamente el estudiante

        assertEquals(false, biblioteca.crearEstudiante(estudiante1)); // Como el estudiante ya estaba registrado no se pudo volver a crear

    }

    /**
     * Método que elimina un estudiante
     */
    @Test
    public void eliminarEstudianteTest() {
        Biblioteca biblioteca = new Biblioteca("UQ");
        Estudiante estudiante1 = new Estudiante("Juan", "2345678", "098765432", "juan@uqvirtual.edu.co");

        assertEquals(false, biblioteca.eliminarEstudiante(estudiante1)); // Como el estudiante no se encuentra registrado no se pudo eliminar

        biblioteca.crearEstudiante(estudiante1);

        assertEquals(true, biblioteca.eliminarEstudiante(estudiante1)); // Como el estudiante ya estaba registrado se pudo eliminar correctamente

    }

    /**
     * Método que actualiza un estudiante
     */
    @Test
    public void actualizarEstudianteTest() {
        Biblioteca biblioteca = new Biblioteca("UQ");
        Estudiante estudiante1 = new Estudiante("Juan", "2345678", "098765432", "juan@uqvirtual.edu.co");

        assertEquals(false, biblioteca.actualizarEstudiante("jose", "2345678", "098765432", "jose@uqvirtual.edu.co")); // Debido a que el estudiante no esta registrado no se pudo actualizar su información

        biblioteca.crearEstudiante(estudiante1);

        assertEquals(true, biblioteca.actualizarEstudiante("jose", "2345678", "098765432", "jose@uqvirtual.edu.co")); // Como el estudiante si esta registrado se pudo actualizar su información correctamente

    }

         // NOTA //
         // Los metodos anteriores funcionan de la misma manera en cada clase, pero solo realice la prueba unitaria en la clase Estudiante para no alargar innecesariamente estas pruebas

    /**
     * Método que agrega un libro a un prestamo
     */
    @Test
    public void agregarLibroAPrestamoTest() {
        Biblioteca biblioteca = new Biblioteca("UQ");
        Prestamo prestamo1 = new Prestamo("9876789", null, null, null, null);
        Libro libro1 = new Libro("0573932", "1234", "JGYFgui", "igj8iy", "kjcdxms", "2000/08/10", 3,
         1);

        assertEquals(false, biblioteca.agregarLibroAPrestamo(prestamo1.getCodigo(), libro1.getIsbn())); // Como el prestamo y el libro no estan registrados no se puede agregar el libro al prestamo
        
        biblioteca.crearPrestamo(prestamo1);

        assertEquals(false, biblioteca.agregarLibroAPrestamo(prestamo1.getCodigo(), libro1.getIsbn())); // Como el libro no esta registrado no se puede añadir al prestamo

        biblioteca.crearLibro(libro1);

        assertEquals(true, biblioteca.agregarLibroAPrestamo(prestamo1.getCodigo(), libro1.getIsbn())); // Como el libro y el prestamo estan registrados se puede agregar el libor al prestamo

    }

    /**
     * Método para entregar un prestamo
     */
    @Test
    public void entregarPrestamoTest() {
        Biblioteca biblioteca = new Biblioteca("UQ");
        Prestamo prestamo1 = new Prestamo("pjhoiuc", null, null, "2024/09/5",
         "2024/09/10");

        assertEquals(false, biblioteca.entregarPrestamo(prestamo1.getCodigo())); // No se puede entregar el prestamo debido a que este no existe

        biblioteca.crearPrestamo(prestamo1);

        assertEquals(true, biblioteca.entregarPrestamo(prestamo1.getCodigo())); // Se entrega correctamente debido a que si esta creado

    }

    /**
     * Método para calcular el dinero a pagar por un prestamo
     */
    @Test
    public void calcularDineroAPagarPrestamoTest() {
        Biblioteca biblioteca = new Biblioteca("UQ");
        Prestamo prestamo1 = new Prestamo("pjhoiuc", null, null, "2024-09-05",
         "2024-09-10");
        biblioteca.crearPrestamo(prestamo1);
        double dineroAPagarEsperado = 5;
        
        assertEquals(dineroAPagarEsperado, biblioteca.calcularDineroAPagarPrestamo(prestamo1.getCodigo())); // Como hay 5 dias entre 2024-09-05 y 2024-09-10, tomando en cuenta que por cada dia se cobra 1, entonces el total a pagar por el prestamo es de 5
        
    }

    /**
     * Método que muestra en cuantos prestamos esta incluido un bibliotecario
     */
    @Test
    public void cantidadPrestamosBibliotecarioTest() {
        Biblioteca biblioteca = new Biblioteca("UQ");
        Bibliotecario bibliotecario1 = new Bibliotecario("Juan", "123", null, null, 0, 0);
        Prestamo prestamo1 = new Prestamo("2r4g35h6", null, bibliotecario1, null, null);
        Prestamo prestamo2 = new Prestamo("12434t5", null, bibliotecario1, null, null);
        Prestamo prestamo3 = new Prestamo("poiuyt543", null, bibliotecario1, null, null);

        biblioteca.crearPrestamo(prestamo1);
        biblioteca.crearPrestamo(prestamo2);
        biblioteca.crearPrestamo(prestamo3);

        assertEquals(3, biblioteca.cantidadPrestamosBibliotecario(bibliotecario1)); // Como el bibliotecario aparece en 3 prestamos la prueba es correcta

    }

    /**
     * Método que muestra en cuantos prestamos esta incluido un libro
     */
    @Test
    public void prestamosEnLosQueEstaIncluidoUnLibroTest() {
        Biblioteca biblioteca = new Biblioteca("UQ");
        Libro libro1 = new Libro("432", "234", null, "The Witcher", null, null, 10, 0);
        Prestamo prestamo1 = new Prestamo("0oikjhgvf", null, null, null, null);
        Prestamo prestamo2 = new Prestamo("0okmnbgf", null, null, null, null);
        Prestamo prestamo3 = new Prestamo("frethyn", null, null, null, null);

        biblioteca.crearLibro(libro1);
        biblioteca.crearPrestamo(prestamo1);
        biblioteca.crearPrestamo(prestamo2);
        biblioteca.crearPrestamo(prestamo3);
        biblioteca.agregarLibroAPrestamo(prestamo1.getCodigo(), libro1.getIsbn());
        biblioteca.agregarLibroAPrestamo(prestamo2.getCodigo(), libro1.getIsbn());
        biblioteca.agregarLibroAPrestamo(prestamo3.getCodigo(), libro1.getIsbn());
        int cantidadEsperadada = 3;

        assertEquals(cantidadEsperadada, biblioteca.prestamosEnLosQueEstaIncluidoUnLibro(libro1.getTitulo())); // Se agrega correctamente un libro y se itera correctamente para encontrar en que prestamos esta incluido

    }

    /**
     * Método que reemplaza un libro por otro
     */
    @Test
    public void reemplazarLibroTest() {
        Biblioteca biblioteca = new Biblioteca("UQ");
        Libro libro1 = new Libro("0u98g7f", "h9jme", null, null, null, null, 3, 0);
        Libro libro2 = new Libro("8jhgtr", "01203", null, null, null, null, 3, 0);

        biblioteca.crearLibro(libro1);

        assertEquals(false, biblioteca.reemplazarLibro(libro1, libro2.getCodigo())); // No se pudo agregar el libro debido a que el libro a reemplazar no existe

        biblioteca.crearLibro(libro2);

        assertEquals(true, biblioteca.reemplazarLibro(libro1, libro2.getCodigo())); // Como ambos libros existen se pudo reemplazar Correctamente

    }


        // REPORTES //

        /**
         * Método que calcula el dinero total recudado por los prestamos
         */
        @Test
        public void dineroTotalRecaudadoTest() {
            Biblioteca biblioteca = new Biblioteca("UQ");
            Prestamo prestamo1 = new Prestamo("0987654", null, null, "2024-10-10",
            "2024-10-15");
            Prestamo prestamo2 = new Prestamo("4567890", null, null, "2024-10-10",
            "2024-10-15");
            Libro libro1 = new Libro("nibodi", "0988", null, null, null, null, 10, 1);
            Libro libro2 = new Libro("098765dfui", "1233", null, null, null, null, 10, 1);

            biblioteca.crearPrestamo(prestamo1);
            biblioteca.crearPrestamo(prestamo2);
            biblioteca.agregarLibroAPrestamo(prestamo1.getCodigo(), libro1.getIsbn());
            biblioteca.agregarLibroAPrestamo(prestamo2.getCodigo(), libro2.getIsbn());

            double dineroEsperado = biblioteca.calcularDineroAPagarPrestamo(prestamo1.getCodigo()) + biblioteca.calcularDineroAPagarPrestamo(prestamo2.getCodigo());

            assertEquals(dineroEsperado, biblioteca.dineroTotalRecaudado()); // Método funciona correctamente

        }

        /**
         * Método que calcula el dinero a pagar a cada bibliotecario
         */
        @Test
        public void dineroAPagarBibliotecarioTest() {
            Biblioteca biblioteca = new Biblioteca("UQ");
            Bibliotecario bibliotecario1 = new Bibliotecario("Juan", "098765", "1234556", "rfjnov4", 1000,
            0);
            Libro libro1 = new Libro("r345y6u7", "5312", null, null, null, null, 0, 0);
            Libro libro2 = new Libro("123r456y", "0956", null, null, null, null, 0, 0);
            Libro libro3 = new Libro("oiuvi", "0okju", null, null, null, null, 0, 0);
            Prestamo prestamo1 = new Prestamo("6gtbr5v", null, bibliotecario1, "2024-10-10", "2024-10-15");
            Prestamo prestamo2 = new Prestamo("pñlkj", null, bibliotecario1, "2024-10-10", "2024-10-15");
            Prestamo prestamo3 = new Prestamo("0bgctl", null, bibliotecario1, "2024-10-10", "2024-10-15");

            biblioteca.crearBibliotecario(bibliotecario1);
            biblioteca.crearLibro(libro1);
            biblioteca.crearLibro(libro2);
            biblioteca.crearLibro(libro3);
            biblioteca.crearPrestamo(prestamo1);
            biblioteca.crearPrestamo(prestamo2);
            biblioteca.crearPrestamo(prestamo3);

            double dineroPrestamo1 = biblioteca.calcularDineroAPagarPrestamo(prestamo1.getCodigo()) * 0.2;
            double dineroPrestamo2 = biblioteca.calcularDineroAPagarPrestamo(prestamo2.getCodigo()) * 0.2; // Cada prestamo vale (5 * 0.2) = 1
            double dineroPrestamo3 = biblioteca.calcularDineroAPagarPrestamo(prestamo3.getCodigo()) * 0.2;

            double dineroEsperado = dineroPrestamo1 + dineroPrestamo2 + dineroPrestamo3; // (1+1+1 = 3)

            assertEquals(dineroEsperado, biblioteca.dineroAPagarBibliotecario(bibliotecario1)); // Método funciona correctamente

        }

        /**
         * Método que calcula el dinero a pagar a todos los bibliotecarios
         */
        @Test
        public void dineroTotalAPagarTest() {
            Biblioteca biblioteca = new Biblioteca("UQ");
            Bibliotecario bibliotecario1 = new Bibliotecario("Juan", "098765", "1234556", "rfjnov4", 1000,0);
            Bibliotecario bibliotecario2 = new Bibliotecario("fewf", "2t3y467j", "1234556", "rfjnov4", 1000,0);
            Bibliotecario bibliotecario3 = new Bibliotecario("Juf43an", "098u7y56tefr", "1234556", "rfjnov4", 1000,0);
            Libro libro1 = new Libro("r345y6u7", "5312", null, null, null, null, 0, 0);
            Libro libro2 = new Libro("123r456y", "0956", null, null, null, null, 0, 0);
            Libro libro3 = new Libro("oiuvi", "0okju", null, null, null, null, 0, 0);
            Prestamo prestamo1 = new Prestamo("6gtbr5v", null, bibliotecario1, "2024-10-10", "2024-10-15");
            Prestamo prestamo2 = new Prestamo("pñlkj", null, bibliotecario2, "2024-10-10", "2024-10-15");
            Prestamo prestamo3 = new Prestamo("0bgctl", null, bibliotecario3, "2024-10-10", "2024-10-15");

            biblioteca.crearBibliotecario(bibliotecario1);
            biblioteca.crearBibliotecario(bibliotecario2);
            biblioteca.crearBibliotecario(bibliotecario3);
            biblioteca.crearLibro(libro1);
            biblioteca.crearLibro(libro2);
            biblioteca.crearLibro(libro3);
            biblioteca.crearPrestamo(prestamo1);
            biblioteca.crearPrestamo(prestamo2);
            biblioteca.crearPrestamo(prestamo3);

            double dineroAPagarBibliotecario1 = biblioteca.dineroAPagarBibliotecario(bibliotecario1);
            double dineroAPagarBibliotecario2 = biblioteca.dineroAPagarBibliotecario(bibliotecario2);
            double dineroAPagarBibliotecario3 = biblioteca.dineroAPagarBibliotecario(bibliotecario3);
            double dineroTotalAPagarEsperado = dineroAPagarBibliotecario1 + dineroAPagarBibliotecario2 + dineroAPagarBibliotecario3;

            assertEquals(dineroTotalAPagarEsperado, biblioteca.dineroTotalAPagar()); // Método calcula el dinero a pagar correctamente

        }

}
