package co.edu.uniquindio.model;

public class Bibliotecario {

    String nombre, cedula, telefono, correo;
    double salario;

    public Bibliotecario (String nombre, String cedula, String telefono, String correo, double salario) {

        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.correo = correo;
        this.salario = salario;

    }

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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Bibliotecario [nombre=" + nombre + ", cedula=" + cedula + ", telefono=" + telefono + ", correo="
                + correo + ", salario=" + salario + "]";
    }
    

}
