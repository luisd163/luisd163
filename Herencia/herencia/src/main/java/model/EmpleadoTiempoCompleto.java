package model;

public class EmpleadoTiempoCompleto extends Empleado{

    double salarioMensual;
    
    // Constructor EmpleadoTiempoCompleto
    public EmpleadoTiempoCompleto (String nombre, String identificacion, double salarioMensual) {
        super(nombre, identificacion);
        this.salarioMensual = salarioMensual;
    }

    // Setters y Getters
    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    // toString EmpleadoTiempoCompleto
    @Override
    public String toString() {
        return "EmpleadoTiempoCompleto [nombre=" + nombre + ", identificacion=" + identificacion + ", salarioMensual="
                + salarioMensual + "]";
    }

    // Método abstracto
    @Override
    public double calcularSalario() {
        
        double salario = salarioMensual;
        return salario;
    }

    
}
