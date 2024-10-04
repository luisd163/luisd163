package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import model.EmpleadoPorHora;
import model.Empleado;

public class EmpleadoPorHoraTest {

    @Test
    public void calcularSalarioTestEmpleadoPorHora() {

        Empleado empleado1 = new EmpleadoPorHora("juan", "1020302622", 1,
         20000);
        double resultadoEsperado = 20000;
        assertEquals(resultadoEsperado, empleado1.calcularSalario());
    }
}
