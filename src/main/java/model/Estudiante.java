package model;

import java.util.LinkedList; 


public class Estudiante extends Persona{

    LinkedList<Prestamo> listaPrestamosEstudiante;
    /**
     * Método constructor de la clase Estudiante
     * @param nombre
     * @param cedula
     * @param telefono
     * @param correo
     */
    public Estudiante (String nombre, String cedula, String telefono, String correo) {
        super(nombre, cedula, telefono, correo);
        listaPrestamosEstudiante = new LinkedList<>();

    }

        // Métodos clase estudiante //

     /**
     * Método que agrega un prestamo a un estudiante
     * @param prestamo prestamo que se va a agregar al estudiante
     * @return false si no se pudo agregar el prestamo, true si se agrego correctamente
     */
    public boolean agregarPrestamoEstudiante(Prestamo prestamo) {
        boolean verificar = false;
        for (Prestamo prestamoAux : listaPrestamosEstudiante) { 
            if (prestamoAux.getCodigo().equals(prestamo.getCodigo())) {
                System.out.println("\nEl prestamo ya esta asociado a este estudiante");
                return verificar;
            }
        }
        // Se llega aqui si ya se verifico que el prestamo no existe en la lista de prestamos del estudiante
        listaPrestamosEstudiante.add(prestamo);
        System.out.println("\nPrestamo añadido a este estudiante");
        verificar = true;
        return verificar;
    }
    

    /**
     * Método que elimina un prestamo de un estudiante
     * @param prestamo prestamo a eliminar del estudiante
     * @return false si no se pudo eliminar, true si se elimino correctamente
     */
    public boolean eliminarPrestamoEstudiante(Prestamo prestamo) {
        boolean verificar = false;
        for (Prestamo prestamoAux : listaPrestamosEstudiante) {
            if (prestamoAux.getCodigo().equals(prestamo.getCodigo())) {
                listaPrestamosEstudiante.remove(prestamoAux);
                System.out.println("\nPrestamo eliminado de este estudiante");
                verificar = true;
                return verificar;
            }
        }
        // Solo se llega aquí si no se encontró el préstamo
        System.out.println("\nEl prestamo no existe o no esta registrado");
        return verificar;
    }
    

        // Setters y Getters    

    public LinkedList<Prestamo> getListaPrestamosEstudiante() {
        return listaPrestamosEstudiante;
    }

    public void setListaPrestamosEstudiante(LinkedList<Prestamo> listaPrestamosEstudiante) {
        this.listaPrestamosEstudiante = listaPrestamosEstudiante;
    }
    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", listaPrestamosEstudiante=" + listaPrestamosEstudiante + ", cedula="
                + cedula + ", telefono=" + telefono + ", correo=" + correo + "]";
    }


    
}
