package Codigos;
import Interfaces.IRegistrable;
import java.time.LocalDate;

public class RegistroTransacciones extends Prestamo implements IRegistrable {
    private int idRegistro = 0;
    private LibroDisponible libro;
    private String nombreCompletoUsuario;
    private String dniUsuario;
    private String telefonoUsuario;
    private String fechaPrestamo;
    private String fechaDevolucion;
    
    public RegistroTransacciones(LibroDisponible libro, String nombreCompletoUsuario,
            String dniUsuario, String telefonoUsuario,  String fechaPrestamo,
            String fechaDevolucion) {
        this.libro = libro;
        this.nombreCompletoUsuario = nombreCompletoUsuario;
        this.dniUsuario = dniUsuario;
        this.telefonoUsuario = telefonoUsuario;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        idRegistro++;
    }

    public static String calcularFechaDevolucion(int diasPrestamo) {
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaDevolucion = fechaActual.plusDays(diasPrestamo);
        return fechaDevolucion.toString();
    }
    
    @Override
    public void realizar() {
        System.out.println("El registro fue exitoso");
    }
    @Override
    public void cancelar() {
    System.out.println("Cancelando el registro...");
    }
    @Override
    public void agregarPrestamo(RegistroTransacciones registro) {
        listaPrestamoLibro.add(registro);
    }
    @Override
    public void eliminarPrestamo(RegistroTransacciones registro) {
        listaPrestamoLibro.remove(registro);
    }

    public int getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }

    @Override
    public LibroDisponible getLibro() {
        return libro;
    }

    public void setLibro(LibroDisponible libro) {
        this.libro = libro;
    }

    public String getNombreCompletoUsuario() {
        return nombreCompletoUsuario;
    }

    public void setNombreCompletoUsuario(String nombreCompletoUsuario) {
        this.nombreCompletoUsuario = nombreCompletoUsuario;
    }

    public String getDniUsuario() {
        return dniUsuario;
    }

    public void setDniUsuario(String dniUsuario) {
        this.dniUsuario = dniUsuario;
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

    

    public String getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public void setTelefonoUsuario(String telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }
   
}











    