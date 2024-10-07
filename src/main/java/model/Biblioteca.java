package model;

import java.time.LocalDate; 
import java.time.format.DateTimeFormatter; 
import java.time.temporal.ChronoUnit;
import java.util.LinkedList; 

public class Biblioteca {

    LinkedList<Estudiante> listaEstudiantes;// Lista estudiantes registrados 
    LinkedList<Bibliotecario> listaBibliotecarios; // Lista Bibliotecarios registrados
    LinkedList<Prestamo> listaPrestamos; // Lista Prestamos Registrados
    LinkedList<Libro> listaLibros; // Lista Libros registrados
    String nombre;

    /**
     * Método constructor de la clase Biblioteca
     * @param nombre
     */
    public Biblioteca (String nombre) {
        this.nombre = nombre;
        listaEstudiantes = new LinkedList<>();
        listaBibliotecarios = new LinkedList<>();
        listaPrestamos = new LinkedList<>();
        listaLibros = new LinkedList<>();

    }

    /**
     * Método que crea un nuevo estudiante
     * @param nuevoEstudiante estudiante a crear
     * @return false si no se creo, true si se creo
     */
    public boolean crearEstudiante(Estudiante nuevoEstudiante) {
        boolean verificar = false; // Verificaion para saber si se creo o no el estudiante(Se utiliza en la mayoria de metodos para facilitar su comprobación)
        for (Estudiante estudianteAux : listaEstudiantes) {
            if (estudianteAux.getCedula().equals(nuevoEstudiante.getCedula())) {
                System.out.println("\nEl estudiante ya esta registrado");
                return verificar;
            }
        }
        listaEstudiantes.add(nuevoEstudiante);
        System.out.println("\nEstudiante registrado con éxito");
        verificar = true;
        return verificar;
    }
    

    /**
     * Método que elimina un estudiante
     * @param estudiante estudiante que se va a eliminar
     * @return false si no se elimino, true si se elimino
     */
    public boolean eliminarEstudiante(Estudiante estudiante) {
        boolean verificar = false;
        for (Estudiante estudianteAux : listaEstudiantes) {
            if (estudianteAux != null) {
                if (estudianteAux.getCedula().equals(estudiante.getCedula())) {
                    listaEstudiantes.remove(estudiante);
                    System.out.println("\nEstudiante eliminado correctamente");
                    verificar = true;
                    return verificar;
                }
            }
        }
        System.out.println("\nEl estudiante no existe");
        return verificar;
    }
    

    /**
     * Método que actualiza un estudiante
     * @param nombre Nombre del estudiante
     * @param cedula Cedula del estudiante
     * @param telefono Telefono del estudiante
     * @param correo Correo del estudiante
     * @return false si no se pudo actualizar el estudiante, true si se actualizo
     */
    public boolean actualizarEstudiante(String nombre, String cedula, String telefono, String correo) {
        boolean verificar = false;
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante != null) {
                if (estudiante.getCedula().equals(cedula)) {
                    estudiante.setNombre(nombre);
                    estudiante.setCedula(cedula);
                    estudiante.setTelefono(telefono);
                    estudiante.setCorreo(correo);
                    System.out.println("\nEstudiante actualizado con exito");
                    verificar = true;
                    return verificar;
                }
            }
        }
        return verificar;
    }

    /**
     * Método que crea un bibliotecario
     * @param bibliotecario bibliotecario a crear
     * @return false si no se pudo crear, true si se creo
     */
    public boolean crearBibliotecario(Bibliotecario bibliotecario) {
        boolean verificar = false;
        for (Bibliotecario bibliotecarioAux : listaBibliotecarios) {
            if (bibliotecarioAux != null) {
                if (bibliotecarioAux.getCedula().equals(bibliotecario.getCedula())) {
                    System.out.println("\nEl bibliotecario ya esta registrado");
                    return verificar;
                }
            }
        }
        listaBibliotecarios.add(bibliotecario);
        System.out.println("\nBibliotecario creado con exito");
        verificar = true;
        return verificar;
    }

    /**
     * Método que elimina un bibliotecario
     * @param bibliotecario Cedula del bibliotecario a eliminar
     * @return false si no se pudo eliminar, true si se elimino
     */
    public boolean eliminarBibliotecario(Bibliotecario bibliotecario) {
        boolean verificar = false;
        for (Bibliotecario bibliotecarioAux : listaBibliotecarios) {
            if (bibliotecarioAux != null) {
                if (bibliotecarioAux.getCedula().equals(bibliotecario.getCedula())) {
                    listaBibliotecarios.remove(bibliotecario);
                    verificar = true;
                    return verificar;
                }
            }
        }
        System.out.println("\nEl bibliotecario no esta registrado");
        return verificar;
    }

    /**
     * Método que actualiza un bibliotecario
     * @param nombre Nombre del bibliotecario
     * @param cedula Cedula del bibliotecario
     * @param telefono Telefono del bibliotecario
     * @param correo Correco del bibliotecario
     * @param salario Salario del bibliotecario
     * @return
     */
    public boolean actualizarBibliotecario(String nombre, String cedula, String telefono, String correo, double salario) {
        boolean verificar = false;
        for (Bibliotecario bibliotecario : listaBibliotecarios) {
            if (bibliotecario.getCedula().equals(cedula)) {
                bibliotecario.setNombre(nombre);
                bibliotecario.setCedula(cedula);
                bibliotecario.setTelefono(telefono);
                bibliotecario.setCorreo(correo);
                bibliotecario.setSalario(salario);
                System.out.println("\nBibliotecarioActualizado");
                verificar = true;
                return verificar;
            }
        }
        return verificar;
    }

    /**
     * Método que crea un prestamo
     * @param Prestamo prestamo a crear
     * @return false si no se pudo crear el prestamo, true si se creo
     */
    public boolean crearPrestamo(Prestamo prestamo) {
        boolean verificar = false;
        for (Prestamo prestamoAux : listaPrestamos) {
            if (prestamoAux != null) {
                if (prestamoAux.getCodigo().equals(prestamo.getCodigo())) {
                    System.out.println("\nEl prestamo ya esta registrado");
                    return verificar;
                }
            }
        }
        listaPrestamos.add(prestamo);
        verificar = true;
        return verificar;
    }

    /**
     * Método que elimina un prestamo
     * @param prestamo prestamo a eliminar
     * @return false si no se elimino el prestamo, true si se elimino 
     */
    public boolean eliminarPrestamo(Prestamo prestamo) {
        boolean verificar = false;
        for (Prestamo prestamoAux : listaPrestamos) {
            if (prestamoAux != null) {
                if (prestamoAux.getCodigo().equals(prestamo.getCodigo())) {
                    listaPrestamos.remove(prestamo);
                    verificar = true;
                    return verificar;
                }
            }
        }
        System.out.println("\nEl prestamo no esta registrado");
        return verificar;
    }

    /**
     * Método que actualiza un prestamo
     * @param codigo codigo del prestamo
     * @param estudiante estudiante asignado al prestamo
     * @param bibliotecario bibliotecario asignado al prestamo
     * @param fechaPrestamo fecha en la que se realizo el prestamo
     * @param FechaEntrega fecha en la que se entrego el prestamo
     * @return false si no se pudo actualizar el prestamo, true si se pudo actualizar
     */
    public boolean actualizarPrestamo(String codigo, Estudiante estudiante, Bibliotecario bibliotecario, String fechaPrestamo, String FechaEntrega) {
        boolean verificar = false;
        for (Prestamo prestamo : listaPrestamos) {
            if (prestamo.getCodigo().equals(codigo)) {
                prestamo.setCodigo(codigo);
                prestamo.setEstudiante(estudiante);
                prestamo.setBibliotecario(bibliotecario);
                prestamo.setFechaPrestamo(fechaPrestamo);
                prestamo.setFechaEntrega(FechaEntrega);
                verificar = true;
                System.out.println("\nPrestamo actualizado");
                return verificar;
            }
        }
        return verificar;
    }

    /**
     * Método que agrega un libro a un prestamo
     * @param codigo codigo del prestamo
     * @param isbn isbn del libro
     * @return false si no se pudo agregar el libro al prestamo, true si se pudo agregar el libro al prestamo
     */
    public boolean agregarLibroAPrestamo(String codigoPrestamo, String isbn) {
        boolean verificar = false;
        Prestamo prestamoAModificar = null;
        Libro libroAñadir = null;
    
        // Buscar el préstamo a modificar
        for (Prestamo prestamo : listaPrestamos) {
            if (prestamo.getCodigo().equals(codigoPrestamo)) {
                prestamoAModificar = prestamo;
                break;
            }
        }
    
        // Buscar el libro a añadir
        for (Libro libro : listaLibros) {
            if (libro.getIsbn().equals(isbn)) {
                libroAñadir = libro;
                break;
            }
        }
    
        // Verificar si el libro existe
        if (libroAñadir == null) {
            System.out.println("El libro ingresado no existe.");
            return verificar;
        }
    
        // Verificar si el préstamo existe
        if (prestamoAModificar == null) {
            System.out.println("El préstamo ingresado no existe.");
            return verificar;
        }
    
        // Verificar unidades disponibles del libro
        if (libroAñadir.getUnidadesDisponibles() > 0) {
            prestamoAModificar.getListaLibrosPrestamo().add(libroAñadir);
            libroAñadir.setUnidadesDisponibles(libroAñadir.getUnidadesDisponibles() - 1);
            System.out.println("\nLibro añadido al préstamo.");
            verificar = true;
            return verificar; // Retorna true si se añadió correctamente
        } else {
            System.out.println("No hay unidades disponibles de este libro.");
            return verificar; // Retorna false si no hay unidades disponibles
        }
    }
    

    /**
     * Método para entregar un prestamo
     * @param codigoPrestamo codigo del prestamo a entregar
     * @return false si no se pudo entregar el prestamo, true si se pudo entregar el prestamo
     */
    public boolean entregarPrestamo(String codigoPrestamo) {
        boolean verificar = false;
        for (Prestamo prestamo : listaPrestamos) {
            if (prestamo != null) {
                if (prestamo.getCodigo().equals(codigoPrestamo)) {
                    for (DetallePrestamo detalle : prestamo.getListaDetallePrestamos()) {
                        Libro libro = detalle.getLibro();
                        libro.setUnidadesDisponibles(libro.getUnidadesDisponibles() + 1);
                    }
                    listaPrestamos.remove(prestamo);
                    double dineroAPagar = calcularDineroAPagarPrestamo(codigoPrestamo);
                    System.out.println("\nEl dinero a pagar por el prestamo es de: " + dineroAPagar);
                    verificar = true;
                    return verificar;
                }
            }
        }
        System.out.println("\nEl prestamo no esta registrado");
        return verificar;
    }

    /**
     * Método que calcula cuanto se debe pagar por un prestamo
     * @param codigoPrestamo codigo del prestamo a pagar
     * @return double con el valor a pagar por el prestamo
     */
    public double calcularDineroAPagarPrestamo(String codigoPrestamo) {
        double dineroAPagar = 0;
        for (Prestamo prestamo : listaPrestamos) {
            if (prestamo != null) {
                if (prestamo.getCodigo().equals(codigoPrestamo)) {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    LocalDate fechaPrestamo = LocalDate.parse(prestamo.getFechaPrestamo(), formatter);
                    LocalDate fechaEntrega = LocalDate.parse(prestamo.getFechaEntrega(), formatter);
                    long diasDePrestamo =  ChronoUnit.DAYS.between(fechaPrestamo, fechaEntrega);
                    dineroAPagar = diasDePrestamo * 1; // Cuesta 1 dolar al dia
                    System.out.println("\nEl total a pagar por el prestamo es de: " + dineroAPagar);
                    return dineroAPagar;
                }
            }
        }
        System.out.println("\nEl prestamo no existe");
        return dineroAPagar;
    }

    /**
     * Método que consulta los datos de un prestamo 
     * @param codigoPrestamo  Codigo del prestamo a consultar
     * @return Cadena con los datos del prestamo
     */
    public String consultarDatosPrestamo(String codigoPrestamo) {
        String datos = "";
        for (Prestamo prestamo : listaPrestamos) {
            if (prestamo.getCodigo().equals(codigoPrestamo)) {
                datos = prestamo.toString();
                return datos;
            }
        }
        System.out.println("\nEl prestamo no existe");
        return datos;
    }

    /**
     * Método que muestra la cantidad de prestamos asociados a un bibliotecario
     * @param cedulaBibliotecario Cedula del bibliotecario
     * @return numero de prestamos que tiene asociado el bibliotecario
     */
    public int cantidadPrestamosBibliotecario(Bibliotecario bibliotecario) {
        int cantidadPrestamos = 0;
        for (Prestamo prestamo : listaPrestamos) {
            if (prestamo.getBibliotecario().equals(bibliotecario)) {
                cantidadPrestamos ++;
            }
        }
        return cantidadPrestamos;
    }

    /**
     * Método que crea un libro
     * @param libro libro a crear
     * @return false si no se creo el libro, true si se creo el libro
     */
    public boolean crearLibro(Libro libro) {
        boolean verificar = false;
        for (Libro libroAux : listaLibros) {
            if (libroAux != null) {
                if (libroAux.getCodigo().equals(libro.getCodigo())) {
                    System.out.println("\nEl libro ya esta registrado");
                    return verificar;
                }
            }
        }
        System.out.println("\nEl libro a sido creado con exito");
        listaLibros.add(libro);
        verificar = true;
        return verificar;
    }

    /**
     * Método que elimina un libro
     * @param libro libro a eliminar
     * @return false si el libro no se pudo eliminar, true si lo elimino correctamente
     */
    public boolean eliminarLibro(Libro libro) {
        boolean verificar = false;
        for (Libro libroAux : listaLibros) {
            if (libroAux != null) {
                if (libroAux.getCodigo().equals(libro.getCodigo())) {
                    listaLibros.remove(libro);
                    System.out.println("\nEl libro se elimino correctamente");
                    verificar = true;
                    return verificar;
                }
            }
        }
        System.out.println("\nEl libro no esta registrado");
        return verificar;
    }

    /**
     * Método que actualiza un libro
     * @param codigo codigo del libro
     * @param isbn isbn del libro
     * @param autor autor del libro
     * @param titulo titulo del libro
     * @param editorial editorial del libro
     * @param fecha fecha del libro
     * @param unidadesDisponibles unidades disponibles del libro
     * @return false si el libro no existe o no esta registrado, true si el libro se actualizo correctamente
     */
    public boolean actualizarLibro(String codigo, String isbn, String autor, String titulo, String editorial, String fecha, int unidadesDisponibles) {
        boolean verificar = false;
        for (Libro libro : listaLibros) {
            if (libro.getCodigo().equals(codigo)) {
                libro.setCodigo(codigo);
                libro.setIsbn(isbn);
                libro.setAutor(autor);
                libro.setTitulo(titulo);
                libro.setEditorial(editorial);
                libro.setFecha(fecha);
                libro.setUnidadesDisponibles(unidadesDisponibles);
                System.out.println("\nLibro actualizado");
                verificar = true;
                return verificar;
            }
        }
        return verificar;
    }

    /**
     * Método que consulta los datos de un libro
     * @param codigo Codigo del libro
     * @return cadena de texto con los datos del libro, si el libro no existe no apareceran datos
     */
    public String consultarDatosLibro(String codigo) {
        String datos = "";
        for (Libro libro : listaLibros) {
            if (libro.getCodigo().equals(codigo)) {
                datos = libro.toString();
                return datos;
            }
        }
        System.out.println("\nEl libro no exite");
        return datos;
    }

    /**
     * Método que muestra la cantidad de prestamos en los que se encuentra un libro
     * @param titulo Titulo del libro a analizar
     * @return entero con la cantidad de prestamos en la que se encuentra el libro
     */
    public int prestamosEnLosQueEstaIncluidoUnLibro(String titulo) {
        int numeroPrestamos = 0;
        for (Prestamo prestamo : listaPrestamos) {
                if (prestamo != null) {
                    for (Libro libro : prestamo.getListaLibrosPrestamo()) {
                        if (libro != null) {
                            if (libro.getTitulo().equals(titulo)) {
                                numeroPrestamos ++;
                            }
                        }
                    }
                }
        }
        return numeroPrestamos;
    }
    

    /**
     * Método que reemplaza un libro por otro
     * @param libroNuevo Libro que voy a poner en la posicion de otro
     * @param codigoLibroAReemplazar Libro que va a ser sobrescrito por LibroNuevo
     * @return false si no se pudo reemplazar, true si se reemplazo correctamente 
     */
    public boolean reemplazarLibro(Libro libroNuevo, String codigoLibroAReemplazar) {
        boolean verificar = false;
        for (Libro libro : listaLibros) {
            if (libro.getCodigo().equals(codigoLibroAReemplazar) && libroNuevo != null) {
                libro = libroNuevo;
                verificar = true;
                return verificar;
            }
        }
        return verificar;
    }

        // REPORTES

    /**
     * Método que muestra los datos del estudiante con mas prestamos
     * @return Cadena con los datos del estudiante con mas prestamos
     */
    public String estudianteConMasPrestamos() {
        String estudianteConMasPrestamos = "";
        int contadorEstudiante = 0;
        int contadorMaximo = 0;
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante != null) {
                for (Prestamo prestamo : estudiante.getListaPrestamosEstudiante()) {
                    if (prestamo != null) {
                        contadorEstudiante ++;
                        if (contadorEstudiante > contadorMaximo) {
                            contadorMaximo = contadorEstudiante;
                            estudianteConMasPrestamos = estudiante.toString();
                        }
                    }
                }
            }
        }
        return estudianteConMasPrestamos;
    }

    /**
     * Metodo que calcula el dinero total recaudado de la biblioteca
     * @return double con el dinero total recaudado
     * 
     * En este metodo se toma el valor total, pero no se descuenta el valor a pagar de los bibliotecarios
     */
    public double dineroTotalRecaudado() {
        double gananciaTotal = 0;
        for (Prestamo prestamo : listaPrestamos) {
            gananciaTotal += calcularDineroAPagarPrestamo(prestamo.getCodigo());
        }
        return gananciaTotal;
    }

    /**
     * Método que calcula el dinero total a pagar a todos los bibliotecarios
     * @return double con el dinero total a pagar
     */
    public double dineroTotalAPagar() {
        double dineroTotalAPagar = 0;
        for (Bibliotecario bibliotecario : listaBibliotecarios) {
            double dineroPorEmpleado = dineroAPagarBibliotecario(bibliotecario);
            dineroTotalAPagar += dineroPorEmpleado;
        }
        return dineroTotalAPagar;
    }

    /**
     * Método que calcula el dinero a pagar de un bibliotecario
     * @param bibliotecario // El bibliotecario a calcular su pago
     * @return boolean con el dinero total a pagar, dependiendo de su cantidad de prestamos y sus años de antiguedad
     */
    public double dineroAPagarBibliotecario(Bibliotecario bibliotecario) {
        double dineroAPagar = 0; // dinero total a pagar al bibliotecario
        double dineroAcomulado = 0; // dinero que reune el bibliotecario (20% de cada prestamo a su nombre)
        double porcentajeBonificacion = 0; // porcentaje de bonficacion por cada año de antiguedad
        double valorBonificacion = 0; // valor de la bonificacion que se le va a sumar al dinero acomulado
        for (Prestamo prestamo : listaPrestamos) {
            if (prestamo != null) {
                String cedulaBibliotecario = prestamo.getBibliotecario().getCedula();
                if (cedulaBibliotecario.equals(bibliotecario.getCedula())) {
                    dineroAcomulado += calcularDineroAPagarPrestamo(prestamo.getCodigo()) * 0.2;
                }
            }
        }
        if (bibliotecario.getAñosDeAntiguedad() == 0) {
            dineroAPagar = dineroAcomulado;
            return dineroAPagar;
        }
        for (int i = 0; i <= bibliotecario.getAñosDeAntiguedad(); i++) {
            porcentajeBonificacion += 0.2;
        }
        valorBonificacion = dineroAcomulado * porcentajeBonificacion;
        dineroAPagar = dineroAcomulado + valorBonificacion;
        return dineroAPagar;
    }

        // Setters y Getters de la clase Biblioteca

    public LinkedList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(LinkedList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public LinkedList<Bibliotecario> getListaBibliotecarios() {
        return listaBibliotecarios;
    }

    public void setListaBibliotecarios(LinkedList<Bibliotecario> listaBibliotecarios) {
        this.listaBibliotecarios = listaBibliotecarios;
    }

    public LinkedList<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(LinkedList<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

    public LinkedList<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(LinkedList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // toString clase Biblioteca
    @Override
    public String toString() {
        return "Biblioteca [listaEstudiantes=" + listaEstudiantes + ", listaBibliotecarios=" + listaBibliotecarios
                + ", listaPrestamos=" + listaPrestamos + ", listaLibros=" + listaLibros + ", nombre=" + nombre + "]";
    }

    
}
