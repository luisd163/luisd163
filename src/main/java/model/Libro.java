package model;

public class Libro {

    String codigo, isbn, autor, titulo, editorial;
    String fecha;
    int unidadesDisponibles;
    double precio;

    /**
     * Método constructor de la clase Libro
     * @param codigo
     * @param isbn
     * @param autor
     * @param titulo
     * @param editorial
     * @param fecha
     * @param unidadesDisponibles
     */
    public Libro (String codigo, String isbn, String autor, String titulo, String editorial, String fecha, int unidadesDisponibles, double precio) {

        this.codigo = codigo;
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
        this.fecha = fecha;
        this.unidadesDisponibles = unidadesDisponibles;
        this.precio = precio; 
    }

        // Setters y Getters

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // toString clase Libro
    @Override
    public String toString() {
        return "Libro [codigo=" + codigo + ", isbn=" + isbn + ", autor=" + autor + ", titulo=" + titulo + ", editorial="
                + editorial + ", fecha=" + fecha + ", unidadesDisponibles=" + unidadesDisponibles + ", precio=" + precio
                + "]";
    }


}
