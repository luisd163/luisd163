package model;

public class EmpleadoPorHora extends Empleado{

    int horasTrabajadas;
    double salarioPorHora;

    // Constructor EmpleadoPorHora
    public EmpleadoPorHora (String nombre, String identificacion, int horasTrabajadas, double salarioPorHora) {
        super(nombre, identificacion);
        this.horasTrabajadas = horasTrabajadas;
        this.salarioPorHora = salarioPorHora;

    }

    // Setters y Getters
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }
    
    // toString EmpleadoPorHora
    @Override
    public String toString() {
        return "EmpleadoPorHora [nombre=" + nombre + ", identificacion=" + identificacion + ", horasTrabajadas="
                + horasTrabajadas + ", salarioPorHora=" + salarioPorHora + "]";
    }

    // Método abstracto
    @Override
    public double calcularSalario() {

        double salario = horasTrabajadas * salarioPorHora;
        return salario;
    }
}
