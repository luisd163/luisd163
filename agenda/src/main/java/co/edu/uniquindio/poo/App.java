package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;

import model.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        // Contactos
        Contacto contacto1 = new Contacto("Luis", "Lucho", "Calle 60 #48-20", "3205729072", "luisd@uqvirtual.edu.co");
        Contacto contacto2 = new Contacto("Manuel Camilo", "Manolo", "Calle 27 #38-20", "3205780072", "manuelc@uqvirtual.edu.co");
        Contacto contacto3 = new Contacto("Andrey", "Androide", "Calle 90 #78-38", "3205729678", "andreye@uqvirtual.edu.co");
        Contacto contacto4 = new Contacto("Juan Esteban", "Juanes", "Calle 90 #78-38", "3205729678", "juane@uqvirtual.edu.co");
        Contacto contacto5 = new Contacto("nicolas", "Criko", "Calle 90 #78-38", "3205729678", "nicolas@uqvirtual.edu.co");
        Contacto contacto6 = new Contacto("Juan pablo", "juan", "Calle 90 #78-38", "3205729678", "juan@uqvirtual.edu.co");

        // Mostrar Contactos
        JOptionPane.showMessageDialog(null, contacto1, null, 0);
        JOptionPane.showMessageDialog(null, contacto2, null, 0);
        JOptionPane.showMessageDialog(null, contacto3, null, 0);
        JOptionPane.showMessageDialog(null, contacto4, null, 0);
        JOptionPane.showMessageDialog(null, contacto5, null, 0);
        JOptionPane.showMessageDialog(null, contacto6, null, 0);

        // Grupos
        Grupo grupo1 = new Grupo("Amigos", "Amigos");

        // Agregar Contactos a un grupo
        grupo1.agregarContactoGrupo(contacto1);
        grupo1.agregarContactoGrupo(contacto2);

        // Eliminar contactos de una reunion
        grupo1.eliminarContactoGrupo(contacto2);

        // Mostrar Grupos
        JOptionPane.showMessageDialog(null, grupo1, null, 0);

        // Reuniones
        Reunion reunion1 = new Reunion("Cumpleaños", null, null, "Fiesta");

        // Agregar contactos a reuniones
        reunion1.agregarContactoReunion(contacto1);
        reunion1.agregarContactoReunion(contacto2);

        // Eliminar contacto de reuniones
        reunion1.eliminarContactoReunion(contacto1);

        // Mostrar Reuniones
        JOptionPane.showMessageDialog(null, reunion1, null, 0);
    }
}
