package model;


public class Persona {

    String nombre, cedula, telefono, correo;

    /**
     * Método constructor de la clase Persona
     * @param nombre
     * @param cedula
     * @param telefono
     * @param correo
     */
    public Persona (String nombre, String cedula, String telefono, String correo) {

        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.correo = correo;
    }

        // Setters y Getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
}
