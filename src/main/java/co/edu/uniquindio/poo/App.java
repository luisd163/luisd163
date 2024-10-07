package co.edu.uniquindio.poo;

import model.Biblioteca;
import model.Bibliotecario;
import model.Estudiante;
import model.Libro;
import model.Prestamo;

public class App {
    public static void main(String[] args) {
        
        // Biblioteca //
        
        Biblioteca biblioteca = new Biblioteca("Biblioteca Universidad");

        // Bibliotecarios //

        Bibliotecario bibliotecario1 = new Bibliotecario("Juan", "4567890", "3456789", "XSRYTUI", 1000, 0);
        Bibliotecario bibliotecario2 = new Bibliotecario("Julian", "098234579", "3456789", "XSRYTUI", 1000, 1);
        Bibliotecario bibliotecario3 = new Bibliotecario("Jose", "34568987654", "3456789", "XSRYTUI", 1000, 2);

        biblioteca.crearBibliotecario(bibliotecario1);
        biblioteca.crearBibliotecario(bibliotecario2);
        biblioteca.crearBibliotecario(bibliotecario3);

        // Estudiantes //

        Estudiante estudiante1 = new Estudiante("Manolo", "0987654", "2345678", "asdfghjkl");
        Estudiante estudiante2 = new Estudiante("Oscar", "7895324567", "2345678", "asdfghjkl");
        Estudiante estudiante3 = new Estudiante("Yuli", "12345670", "2345678", "asdfghjkl");

        biblioteca.crearEstudiante(estudiante1);
        biblioteca.crearEstudiante(estudiante2);
        biblioteca.crearEstudiante(estudiante3);

        // Libros //

        Libro libro1 = new Libro("bihonl", "poknjbhvt", "bouivyb", "ovubol", "opiuv", "2000-02-3", 10, 1);
        Libro libro2 = new Libro("f345hj", "56hg4", "657j", "34g46", "53g4", "2000-09-3", 10, 1);
        Libro libro3 = new Libro("dqf3", "32456", "5g43f4w", "f34t6y", "34f34", "2000-01-5", 10, 1);

        biblioteca.crearLibro(libro1);
        biblioteca.crearLibro(libro2);
        biblioteca.crearLibro(libro3);

        // Prestamos //

        Prestamo prestamo1 = new Prestamo("G59", estudiante1, bibliotecario1, "2024/06/10", "2024/06/15");
        Prestamo prestamo2 = new Prestamo("B09", estudiante2, bibliotecario2, "2024/06/18", "2024/06/22");
        Prestamo prestamo3 = new Prestamo("098", estudiante3, bibliotecario3, "2024/07/1", "2024/07/6");

        biblioteca.crearPrestamo(prestamo1);
        biblioteca.crearPrestamo(prestamo2);
        biblioteca.crearPrestamo(prestamo3);

        // Métodos //

        biblioteca.agregarLibroAPrestamo(prestamo1.getCodigo(), libro1.getIsbn());
        biblioteca.entregarPrestamo(prestamo1.getCodigo());
        biblioteca.calcularDineroAPagarPrestamo(prestamo2.getCodigo());
        biblioteca.consultarDatosPrestamo(prestamo3.getCodigo());
        biblioteca.cantidadPrestamosBibliotecario(bibliotecario3);
        biblioteca.consultarDatosLibro(libro2.getCodigo());
        biblioteca.prestamosEnLosQueEstaIncluidoUnLibro(libro3.getTitulo());
        biblioteca.reemplazarLibro(libro3, libro2.getCodigo());

        // REPORTES //

        biblioteca.estudianteConMasPrestamos();
        biblioteca.dineroTotalRecaudado();
        biblioteca.dineroTotalAPagar();
        biblioteca.dineroAPagarBibliotecario(bibliotecario3);

    }
}
