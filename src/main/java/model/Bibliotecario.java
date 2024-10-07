package model;

import java.util.LinkedList;

public class Bibliotecario extends Persona{

    double salario;
    int añosDeAntiguedad;
    LinkedList<Prestamo> listaPrestamosBibliotecario;

    /**
     * Método constructor de la clase Bibliotecario
     * @param nombre
     * @param cedula
     * @param telefono
     * @param correo
     * @param salario
     */
    public Bibliotecario (String nombre, String cedula, String telefono, String correo, double salario, int añosDeAntiguedad) {
        super(nombre, cedula, telefono, correo);
        this.salario = salario;
        this.añosDeAntiguedad = añosDeAntiguedad;
        listaPrestamosBibliotecario = new LinkedList<>();
        
    }

        //Métodos de la clase Bibliotecario

    /**
     * Método que agrega un prestamo a un bibliotecario
     * @param prestamo prestamo que se va a agregar al bibliotecario
     * @return false si no pudo agregar el prestamo, true si se agrego correctamente
     */
    public boolean agregarPrestamoBibliotecario(Prestamo prestamo) {
        boolean verificar = false;
        for (Prestamo prestamoAux : listaPrestamosBibliotecario) { 
            if (prestamoAux.getCodigo().equals(prestamo.getCodigo())) {
                System.out.println("\nEl prestamo ya esta asociado a este bibliotecario");
                return verificar;
            }
        }
        
        // Si no se encontró el préstamo, lo agrega
        listaPrestamosBibliotecario.add(prestamo);
        System.out.println("\nPrestamo añadido al bibliotecario");
        verificar = true;
        return verificar;
    }
    

    /**
     * Método que elimina un prestamo de un bibliotecario
     * @param prestamo Prestamo a eliminar
     * @return false si no se pudo eliminar, true si se elimino correctamente
     */
    public boolean eliminarPrestamoBibliotecario(Prestamo prestamo) {
        boolean verificar = false;
        for (Prestamo prestamoAux : listaPrestamosBibliotecario) {
            if (prestamoAux.getCodigo().equals(prestamo.getCodigo())) {
                listaPrestamosBibliotecario.remove(prestamoAux);
                System.out.println("\nPrestamo eliminado de este bibliotecario");
                verificar = true;
                return verificar;
            }
        }
        // Solo se llega aquí si no se encontró el préstamo
        System.out.println("\nEl prestamo no existe");
        return verificar;
    }
    

        // Setters y Getters

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getAñosDeAntiguedad() {
        return añosDeAntiguedad;
    }

    public void setAñosDeAntiguedad(int añosDeAntiguedad) {
        this.añosDeAntiguedad = añosDeAntiguedad;
    }

    public LinkedList<Prestamo> getListaPrestamosBibliotecario() {
        return listaPrestamosBibliotecario;
    }

    public void setListaPrestamosBibliotecario(LinkedList<Prestamo> listaPrestamosBibliotecario) {
        this.listaPrestamosBibliotecario = listaPrestamosBibliotecario;
    }

    @Override
    public String toString() {
        return "Bibliotecario [salario=" + salario + ", nombre=" + nombre + ", cedula=" + cedula + ", añosDeAntiguedad="
                + añosDeAntiguedad + ", telefono=" + telefono + ", correo=" + correo + ", listaPrestamosBibliotecario="
                + listaPrestamosBibliotecario + "]";
    }


    
}
