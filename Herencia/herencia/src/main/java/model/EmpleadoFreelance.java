package model;

public class EmpleadoFreelance extends Empleado{

    int proyectosCompletados;
    double pagoPorProyecto;

    // Constructor EmpleadoFreelance
    public EmpleadoFreelance (String nombre, String identificacion, int proyectosCompletados, double pagoPorProyecto) {
        super(nombre, identificacion);
        this.proyectosCompletados = proyectosCompletados;
        this.pagoPorProyecto = pagoPorProyecto;

    }

    // Setters y Getters
    public int getProyectosCompletados() {
        return proyectosCompletados;
    }

    public void setProyectosCompletados(int proyectosCompletados) {
        this.proyectosCompletados = proyectosCompletados;
    }

    public double getPagoPorProyecto() {
        return pagoPorProyecto;
    }

    public void setPagoPorProyecto(double pagoPorProyecto) {
        this.pagoPorProyecto = pagoPorProyecto;
    }

    // toString EmpleadoFreelance
    @Override
    public String toString() {
        return "EmpleadoFreelance [nombre=" + nombre + ", identificacion=" + identificacion + ", proyectosCompletados="
                + proyectosCompletados + ", pagoPorProyecto=" + pagoPorProyecto + "]";
    }

    // Método abstracto
    @Override
    public double calcularSalario() {
        double salario = 0;
        salario = proyectosCompletados * pagoPorProyecto;
        return salario;
    }

}
