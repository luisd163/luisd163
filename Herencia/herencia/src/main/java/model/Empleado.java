package model;

public abstract class Empleado {

    String nombre, identificacion;

    // Constructor empleado
    public Empleado (String nombre, String identificacion) {

        this.nombre = nombre;
        this.identificacion = identificacion;

    }

    // Setters y Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * Método abstracto para calcular el salario
     * @return
     */
    public abstract double calcularSalario();
}
