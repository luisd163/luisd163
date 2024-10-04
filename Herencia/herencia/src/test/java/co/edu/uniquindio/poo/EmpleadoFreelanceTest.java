package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import model.EmpleadoFreelance;
import model.Empleado;

public class EmpleadoFreelanceTest {

    @Test 
    public void calcularSalarioEmpleadoFreelance() {
        
        Empleado empleado1 = new EmpleadoFreelance("Juan", "null", 2,
         1000000);
        double resultadoEsperado = 2000000;
        empleado1.calcularSalario();
        assertEquals(resultadoEsperado, empleado1.calcularSalario());
        
    }
}
