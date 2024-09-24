package model;

import java.sql.Time;
import java.sql.Date;
import java.util.Collection;
import java.util.LinkedList;

public class Reunion {

    String descripcion;
    Date fecha;
    Time hora;
    String clase;
    Collection<Contacto> listaContactos;

    public Reunion(String descripcion, Date fecha, Time hora, String clase) {

        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.clase = clase;
        this.listaContactos = new LinkedList<>();

    }
    

    public String getClase() {
        return clase;
    }


    public void setClase(String clase) {
        this.clase = clase;
    }


    public Collection<Contacto> getListaContactos() {
        return listaContactos;
    }


    public void setListaContactos(Collection<Contacto> listaContactos) {
        this.listaContactos = listaContactos;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    
    @Override
    public String toString() {
        return "Reunion [descripcion=" + descripcion + ", fecha=" + fecha + ", hora=" + hora + ", clase=" + clase
                + ", listaContactos=" + listaContactos + "]";
    }





    


    /**
     * Método que agrega un contacto a la reunion
     * @param contacto
     */
    public void agregarContactoReunion(Contacto contacto) {

        if (!verificarContacto(contacto.getNombre(), contacto.getTelefono())) {
            listaContactos.add(contacto);
            System.out.println("Contacto agregado a la reunion exitosamente");
        } else {
            System.out.println("El contacto ya existe en la reunion");
        }

    }

    public boolean verificarContacto(String descripcion, String telefono) {
        
        for (Contacto contacto : listaContactos) {
            if (contacto.getNombre().equals(descripcion) && contacto.getTelefono().equals(telefono)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Método que elimina un contacto de la reunion
     * @param contacto
     */
    public void eliminarContactoReunion(Contacto contacto) {

        if (verificarContacto(contacto.getNombre(), contacto.getTelefono())) {
            listaContactos.remove(contacto);
            System.out.println("Contacto eliminado de la reunion");
        } else {
            System.out.println("Contacto no encontrado");
        }
    }
}
