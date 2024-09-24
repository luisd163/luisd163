package model;

import java.sql.Date;
import java.sql.Time;
import java.util.Collection;
import java.util.LinkedList;

public class Agenda {

    String nombre;
    Collection<Contacto> listaContactos;
    Collection<Grupo> listaGrupos;
    Collection<Reunion> listaReuniones;

    public Agenda(String nombre) {

        this.nombre = nombre;
        this.listaContactos = new LinkedList<>();
        this.listaGrupos = new LinkedList<>();

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
     * Método que elimina contactos
     * 
     * @param telefono
     */
    public void eliminarContacto1(Contacto contacto) {

        if (verificarContacto(contacto.getNombre(), contacto.getTelefono())) {
            listaContactos.remove(contacto);
            System.out.println("Contacto eliminado exitosamente");
        } else {
            System.out.println("El contacto no existe");
        }
    }

    /**
     * Método que actualiza un contacto
     * 
     * @param nombre
     * @param alias
     * @param direccion
     * @param telefono
     * @param email
     */
    public void actualizarContacto(String nombre, String alias, String direccion, String telefono, String email) {

        for (Contacto contacto : listaContactos) {
            if (contacto.getNombre().equals(nombre) && contacto.getTelefono().equals(telefono)) {
                contacto.setNombre(nombre);
                contacto.setAlias(alias);
                contacto.setDireccion(telefono);
                contacto.setTelefono(telefono);
                contacto.setEmail(email);
                System.out.println("Contacto actualizado");

            }
        }
    }

    /**
     * Método que elimina un grupo
     * 
     * @param nombre
     * @param categoria
     */
    public void eliminarGrupo(String nombre, String categoria) {

        for (Grupo grupo : listaGrupos) {
            if (grupo.getNombre().equals(nombre) && grupo.getCategoria().equals(categoria)) {
                listaGrupos.remove(grupo);
                System.out.println("Grupo eliminado exitosamente");
                break;
            } else {
                System.out.println("El grupo no existe");
            }
        }
    }

    /**
     * Método que actualiza un grupo
     * 
     * @param nombre
     * @param categoria
     * @param listaContactos
     */
    public void actualizarGrupo(String nombre, String categoria, Collection<Contacto> listaContactos) {

        for (Grupo grupo : listaGrupos) {
            grupo.setNombre(nombre);
            grupo.setCategoria(categoria);
            grupo.setListaContactos(listaContactos);
            System.out.println("Grupo actualizada");

        }
    }

    /**
     * Método que elimina una reunion
     * @param reunion
     */
    public void eliminarReunion(Reunion reunion) {

        if (verificarReunion(reunion.getDescripcion(), reunion.getClase())) {
            listaReuniones.remove(reunion);
            System.out.println("Reunion eliminada con exito");
        } else {
            System.out.println("La reunion no existe");
        }
    }

    /**
     * Método que actualiza una reunion
     * @param descripcion
     * @param fecha
     * @param hora
     * @param clase
     * @param listaContactos
     */
    public void actualizarReunion(String descripcion, Date fecha, Time hora, String clase, Collection<Contacto> listaContactos) {

        for (Reunion reunion : listaReuniones) {
            reunion.setDescripcion(descripcion);
            reunion.setFecha(fecha);
            reunion.setHora(hora);
            reunion.setClase(clase);
            reunion.setListaContactos(listaContactos);
            System.out.println("Reunion actualizada");
        }
    }

    public boolean verificarReunion(String descripcion, String clase) {

        for (Reunion reunion : listaReuniones) {
            if (reunion.getDescripcion().equals(descripcion) && reunion.getClase().equals(clase)) {
                return true;
            }
        }
        return false;
    }




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Contacto> getListaContactos() {
        return listaContactos;
    }

    public void setListaContactos(Collection<Contacto> listaContactos) {
        this.listaContactos = listaContactos;
    }

    public Collection<Grupo> getListaGrupos() {
        return listaGrupos;
    }

    public void setListaGrupos(Collection<Grupo> listaGrupos) {
        this.listaGrupos = listaGrupos;
    }

    public Collection<Reunion> getListaReuniones() {
        return listaReuniones;
    }

    public void setListaReuniones(Collection<Reunion> listaReuniones) {
        this.listaReuniones = listaReuniones;
    }

    @Override
    public String toString() {
        return "Agenda [nombre=" + nombre + ", listaContactos=" + listaContactos + ", listaGrupos=" + listaGrupos
                + ", listaReuniones=" + listaReuniones + "]";
    }

    
}
