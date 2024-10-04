package co.edu.uniquindio.poo;

import model.EmpleadoTiempoCompleto;
import model.Empleado;
import model.EmpleadoFreelance;
import model.EmpleadoPorHora;

public class App {
    public static void main(String[] args) {

        Empleado empleado1 = new EmpleadoTiempoCompleto("Jose", "12132", 1000000);
        Empleado empleado2 = new EmpleadoPorHora("Juan", "7980", 80, 15000);
        Empleado empleado3 = new EmpleadoFreelance("Josue", "09876", 2, 1000000);

        System.out.println(empleado1.calcularSalario());
        System.out.println(empleado2.calcularSalario());
        System.out.println(empleado3.calcularSalario());
    }
}
