package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import model.EmpleadoTiempoCompleto;
import model.Empleado;

public class EmpleadoTiempoCompletoTest {

    @Test
    public void calcularSalarioTest() {

        Empleado empleado1 = new EmpleadoTiempoCompleto("Juan", "1020302622", 1000000);
        empleado1.calcularSalario();
        double resultadoEsperado = 1000000;
        assertEquals(resultadoEsperado, empleado1.calcularSalario());
    }
}
