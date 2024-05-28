package Codigos;

public abstract class Prestamo<T> {
    protected T detalle;
    protected Usuario usuario;
    protected Libro libro;
    protected String fechaPrestamo;
    protected String fechaDevolucion;
    
    public abstract void realizar();
    public abstract void cancelar();
    
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    
    public T getDetalle() {
        return detalle;
    }

    public void setDetalle(T detalle) {
        this.detalle = detalle;
    }

}
