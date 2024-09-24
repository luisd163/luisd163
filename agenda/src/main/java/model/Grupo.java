package model;

import java.util.Collection;
import java.util.LinkedList;

public class Grupo {

    String nombre;
    String categoria;
    Collection<Contacto> listaContactos;

    public Grupo(String nombre, String categoria) {

        this.nombre = nombre;
        this.categoria = categoria;
        this.listaContactos = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Collection<Contacto> getListaContactos() {
        return listaContactos;
    }

    public void setListaContactos(Collection<Contacto> listaContactos) {
        this.listaContactos = listaContactos;
    }
    

    @Override
    public String toString() {
        return "Grupo [nombre=" + nombre + ", categoria=" + categoria + ", listaContactos=" + listaContactos + "]";
    }






    

    /**
     * Método que agrega un contacto al grupo
     * @param nuevoContacto
     */
    public void agregarContactoGrupo(Contacto nuevoContacto) {

        if (listaContactos.size() >= 5) {
            System.out.println("El grupo tiene mas de 5 contactos, por tanto no se puede agregar mas");
            return;
        }
        if (!verificarContacto(nuevoContacto.getNombre(), nuevoContacto.getTelefono())) {
            listaContactos.add(nuevoContacto);
            System.out.println("Contacto agregado exitosamente");
        } else {
            System.out.println("El contacto ya existe en el grupo");
        }
    }

    public boolean verificarContacto(String nombre, String telefono) {
        
        for (Contacto contacto : listaContactos) {
            if (contacto.getNombre().equals(nombre) && contacto.getTelefono().equals(telefono)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Método que elimina un contacto del grupo
     * @param contacto
     */
    public void eliminarContactoGrupo(Contacto contacto) {

        if (verificarContacto(contacto.getNombre(), contacto.getTelefono())) {
            listaContactos.remove(contacto);
            System.out.println("Contacto eliminado exitosamente");
        } else {
            System.out.println("El contacto no esta en el grupo");
        }
    }


}
