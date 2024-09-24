package co.edu.uniquindio.model;

import java.time.LocalDate;

public class Biblioteca {

    String nombre;
    Estudiante[] listaEstudiantes;
    Bibliotecario[] listaBibliotecarios;
    Libro[] listaLibros;
    Prestamo[] listaPrestamos;

    public Biblioteca (String nombre) {

        this.nombre = nombre;
        this.listaEstudiantes = new Estudiante[100];
        this.listaBibliotecarios = new Bibliotecario[30];
        this.listaLibros = new Libro[500];
        this.listaPrestamos = new Prestamo[100];

    }
    
    /**
     * Método que crea un estudiante
     */
    public void crearEstudiante (Estudiante nuevoEstudiante) {

        int posDisponible = 0;
        Estudiante estudiantEncontrado = null;
        posDisponible = buscarPosDisponibleEstudiante();

        if (posDisponible == -1) {
            System.out.println("\nNo hay espacio para un nuevo estudiante");
        }else {
            estudiantEncontrado = buscarEstudiante(nuevoEstudiante.getCedula());
            if (estudiantEncontrado != null){
                System.out.println("\nEl estudiante ya esta registrado");
            }else {
                listaEstudiantes[posDisponible] = nuevoEstudiante;
                System.out.println("\nEstudiante creado exitosamente");
            }
        }
    }

    /**
     * Método que busca una posicion disponible en la lista de estudiantes
     * @return
     */
    private int buscarPosDisponibleEstudiante () {

        int posDisponible = -1;

        for (int i = 0; i < listaEstudiantes.length; i++) {
            Estudiante estudiante = listaEstudiantes[i];
            if (estudiante == null) {
                posDisponible = i;
                return posDisponible;
            }
        }
        return posDisponible;
    }

    /**
     * Método que busca un estudiante con su cedula
     * @param cedula
     * @return
     */
    private Estudiante buscarEstudiante (String cedula) {

        Estudiante estudianteEncontrado = null;

        for (int i = 0; i < listaEstudiantes.length; i++) {
            Estudiante estudianteAuxiliar = listaEstudiantes[i];
            if (estudianteAuxiliar != null) {
                if (estudianteAuxiliar.getCedula().equals(cedula)) {
                    estudianteEncontrado = estudianteAuxiliar;
                    return estudianteEncontrado;
                }
            }
        }
        return estudianteEncontrado;
    }

    /**
     * Método que elimina un estudiante usando su nombre y su cedula
     * @param nombre
     * @param cedula
     */
    public void eliminarEstudiante (String nombre, String cedula) {

        for (int i = 0; i < listaEstudiantes.length; i++){
            Estudiante estudianteAux = listaEstudiantes[i];
            if (estudianteAux != null) {
                if (estudianteAux.getNombre().equals(nombre) && estudianteAux.getCedula().equals(cedula)) {
                    listaEstudiantes[i] = null;
                    System.out.println("\nEstudiante eliminado exitosamente");
                }else {
                    System.out.println("\nEl estudiante no esta registrado");
                }
            }
        }
    }

    /**
     * Método que actualiza un estudiante
     * @param nombre
     * @param cedula
     * @param telefono
     * @param correo
     */
    public void actualizarEstudiante (String nombre, String cedula, String telefono, String correo) {

        Estudiante estudianteEncontrado = buscarEstudiante(cedula);
        if (estudianteEncontrado != null) {
            estudianteEncontrado.setNombre(nombre);
            estudianteEncontrado.setCedula(cedula);
            estudianteEncontrado.setTelefono(telefono);
            estudianteEncontrado.setCorreo(correo);
            System.out.println("\nEstudiante actualizado");
        }else {
            System.out.println("\nEl estudiante no esta registrado");
        }
    }

    /**
     * Método que crea un bibliotecario
     * @param nuevoBibliotecario
     */
    public void crearBibliotecario(Bibliotecario nuevoBibliotecario) {

        int posDisponible = 0;
        Bibliotecario bibliotecarioEncontrado = null;
        posDisponible = buscarPosDisponibleBibliotecario();

        if (posDisponible == -1) {
            System.out.println("\nNo hay espacio para mas bibliotecarios");
        }else {
            bibliotecarioEncontrado = buscarBibliotecario(nuevoBibliotecario.getNombre(), nuevoBibliotecario.getCedula());
            if (bibliotecarioEncontrado != null) {
                System.out.println("\nEl bibliotecario ya ha sido creado");
            }else {
                listaBibliotecarios[posDisponible] = nuevoBibliotecario;
                System.out.println("\nEl bibliotecario ha sido creado con exito");
            }
        }
    }

    /**
     * Método que busca una posicion disponible en la lista de bibliotecarios
     * @return
     */
    private int buscarPosDisponibleBibliotecario() {

        int posDisponible = -1;

        for (int i = 0; i < listaBibliotecarios.length; i++) {
            if (listaBibliotecarios[i] == null) {
                posDisponible = i;
                return posDisponible;
            }
        }
        return posDisponible;
    }

    /**
     * Método que busca un bibliotecario usando su nombre y cedula
     * @param nombre
     * @param cedula
     * @return
     */
    private Bibliotecario buscarBibliotecario(String nombre, String cedula) {

        Bibliotecario bibliotecarioEncontrado = null;

        for (int i = 0; i < listaBibliotecarios.length; i++) {
            Bibliotecario bibliotecarioAux = listaBibliotecarios[i];
            if (bibliotecarioAux != null) {
                if (bibliotecarioAux.getNombre().equals(nombre) && bibliotecarioAux.getCedula().equals(cedula)) {
                    bibliotecarioEncontrado = bibliotecarioAux;
                    return bibliotecarioEncontrado;
                }
            }
        }
        return bibliotecarioEncontrado;
    }

    /**
     * Método que elimina un bibliotecario
     * @param nombre
     * @param cedula
     */
    public void eliminarBibliotecario(String nombre, String cedula) {

        for (int i = 0; i < listaBibliotecarios.length; i++) {
            Bibliotecario bibliotecarioAux =listaBibliotecarios[i];
            if (bibliotecarioAux != null) {
                if (bibliotecarioAux.getNombre().equals(nombre) && bibliotecarioAux.getCedula().equals(cedula)) {
                    listaBibliotecarios[i] = null;
                    System.out.println("\nBibliotecario Eliminado");
                }else {
                    System.out.println("\nEl Bibliotecario no esta registrado");
                }
            }
        }
    }

    /**
     * Método que actualiza un bibliotecario
     * @param nombre
     * @param cedula
     * @param telefono
     * @param correo
     * @param salario
     */
    public void actualizarBibliotecario(String nombre, String cedula, String telefono, String correo, double salario) {

        Bibliotecario bibliotecarioEncontrado = buscarBibliotecario(nombre, cedula);
        if (bibliotecarioEncontrado != null) {
            bibliotecarioEncontrado.setNombre(nombre);
            bibliotecarioEncontrado.setCedula(cedula);
            bibliotecarioEncontrado.setTelefono(telefono);
            bibliotecarioEncontrado.setCorreo(correo);
            bibliotecarioEncontrado.setSalario(salario);
            System.out.println("\nBibliotecario actualizado exitosamente");
        }else {
            System.out.println("\nEl bibliotecario no esta registrado");
        }
    }

    /**
     * Método que crea un libro
     * @param nuevoLibro
     */
    public void crearLibro(Libro nuevoLibro) {

        int posDisponible = 0;
        Libro libroEncontrado = null;
        posDisponible = buscarPosDisponibleLibro();

        if (posDisponible == -1) {
            System.out.println("\nNo hay espacio para un nuevo libro");
        } else {
            libroEncontrado = buscarLibro(nuevoLibro.getTitulo(), nuevoLibro.getCodigo());
            if (libroEncontrado != null) {
                System.out.println("\nEl libro ya esta registrado");
            }else {
                listaLibros[posDisponible] = nuevoLibro;
                System.out.println("\nLibro registrado exitosamente");
            }
        }
    }

    /**
     * Método que busca una posicion disponible en la lista de libros
     * @return
     */
    private int buscarPosDisponibleLibro() {
        
        int posDisponible = -1;
        for (int i = 0; i < listaLibros.length; i++) {
            if (listaLibros[i] == null) {
                posDisponible = i;
                return posDisponible;
            }
        }
        return posDisponible;
    }

    /**
     * Método que busca un libro usando su titulo y codigo
     * @param titulo
     * @param codigo
     * @return
     */
    private Libro buscarLibro(String titulo, String codigo) {
        
        Libro libroEncontrado = null;

        for (int i = 0; i < listaLibros.length; i++) {
            Libro libroAux = listaLibros[i];
            if (libroAux != null) {
                if (libroAux.getTitulo().equals(titulo) && libroAux.getCodigo().equals(codigo)) {
                    libroEncontrado = libroAux;
                    return libroEncontrado;
                }
            }
        }
        return libroEncontrado;
    }

    /**
     * Método que elimina un libro usando su titulo y codigo
     * @param titulo
     * @param codigo
     */
    public void eliminarLibro(String titulo, String codigo) {

        for (int i = 0; i < listaLibros.length; i++) {
            Libro libroAux = listaLibros[i];
            if (libroAux != null) {
                if (libroAux.getTitulo().equals(titulo) && libroAux.getCodigo().equals(codigo)) {
                    listaLibros[i] = null;
                    System.out.println("\nLibro eliminado exitosamente");
                }else {
                    System.out.println("\nEl libro no esta registrado");
                }
            }
        }
    }

    /**
     * Método que actualiza un libro
     * @param codigo
     * @param isbn
     * @param autor
     * @param titulo
     * @param editorial
     * @param fecha
     * @param unidadesDisponibles
     */
    public void actualizarLibro(String codigo, String isbn, String autor, String titulo, String editorial, LocalDate fecha, int unidadesDisponibles) {

        Libro libroEncontrado = buscarLibro(titulo, codigo);
        if (libroEncontrado != null) {
            libroEncontrado.setCodigo(codigo);
            libroEncontrado.setIsbn(isbn);
            libroEncontrado.setAutor(autor);
            libroEncontrado.setTitulo(titulo);
            libroEncontrado.setEditorial(editorial);
            libroEncontrado.setFecha(fecha);
            libroEncontrado.setUnidadesDisponibles(unidadesDisponibles);
            System.out.println("\nLibro actualizado exitosamente");
        }else {
            System.out.println("\nEl libro no esta registrado");
        }
    }

    /**
     * Método que crea un prestamo
     * @param nuevoPrestamo
     */
    public void crearPrestamo(Prestamo nuevoPrestamo) {

        int posDisponible = 0;
        Prestamo prestamoEncontrado = null;
        posDisponible = buscarPosDisponiblePrestamo();

        if (posDisponible == -1) {
            System.out.println("\nNo hay espacio disponible para otro prestamo");
        }else {
            prestamoEncontrado = buscarPrestamo(nuevoPrestamo.getCodigo());
            if (prestamoEncontrado == null) {
                listaPrestamos[posDisponible] = nuevoPrestamo;
                System.out.println("\nPrestamo creado exitosamente");
            }else {
                System.out.println("\nEl prestamo ya existe");
            }
        }
    }

    /**
     * Método que busca una posicion disponible en la lista de prestamos
     * @return
     */
    private int buscarPosDisponiblePrestamo() {
        
        int posDisponible = -1;

        for (int i = 0; i < listaPrestamos.length; i++) {
            Prestamo prestamo = listaPrestamos[i];
            if (prestamo == null) {
                posDisponible = i;
                return posDisponible;
            }
        }
        return posDisponible;
    }

    /**
     * Método que busca un orestamo usando su codigo
     * @param codigo
     * @return
     */
    private Prestamo buscarPrestamo(String codigo) {
        
        Prestamo prestamoEncontrado = null;

        for (int i = 0; i < listaPrestamos.length; i++) {
            Prestamo prestamoAux = listaPrestamos[i];
            if (prestamoAux != null) {
                if (prestamoAux.getCodigo().equals(codigo)) {
                    prestamoEncontrado = prestamoAux;
                    return prestamoEncontrado;
                } 
            }
        }
        return prestamoEncontrado;
    }

    /**
     * Método que elimina un prestamo
     * @param codigo
     */
    public void eliminarPrestamo(String codigo) {

        for (int i = 0; i < listaPrestamos.length; i++) {
            Prestamo prestamoAux = listaPrestamos[i];
            if (prestamoAux != null) {
                if (prestamoAux.getCodigo().equals(codigo)) {
                    listaPrestamos[i] = null;
                    System.out.println("\nPrestamo eliminado con exito");
                }else {
                    System.out.println("\nEl prestamo no esta registrado");
                }
            }
        }
    }

    /**
     * Método que actualiza un prestamo
     * @param fechaPrestamo
     * @param fechaEntrega
     * @param codigo
     * @param total
     */
    public void actualizarPrestamo(LocalDate fechaPrestamo, LocalDate fechaEntrega, String codigo, double total) {

        Prestamo prestamoEncontrado = buscarPrestamo(codigo);
        if (prestamoEncontrado != null) {
            prestamoEncontrado.setFechaPrestamo(fechaPrestamo);
            prestamoEncontrado.setFechaEntrega(fechaEntrega);
            prestamoEncontrado.setCodigo(codigo);
            prestamoEncontrado.setTotal(total);
            System.out.println("\nPrestamo actualizado");
        }else {
            System.out.println("\nNo se ha encontrado el prestamo");
        }
    }
}
