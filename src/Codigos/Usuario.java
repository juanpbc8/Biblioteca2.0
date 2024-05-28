package Codigos;
public class Usuario extends Persona{
    private static int contadorUsuarios = 0;
    private String email;
    private String DNI;
    private int edad;
    private String telefono;

    public Usuario(String nombreCompleto, String email, String DNI,
            int edad, String telefono) {
        super(nombreCompleto);
        this.email = email;
        this.DNI = DNI;
        this.edad = edad;
        this.telefono = telefono;
    }
    
    @Override
    public void registrar() {
        System.out.println("Usuario registrado con satisfaccion");
    }

    @Override
    public void eliminar() {
        System.out.println("Usuario eliminado con satisfaccion");
    }

    public static int getContadorUsuarios() {
        return contadorUsuarios;
    }

    public static void setContadorUsuarios(int contadorUsuarios) {
        Usuario.contadorUsuarios = contadorUsuarios;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
}









//    public Usuario(String email, String nombreCompleto, String DNI, int edad, String telefono) {
//        this.id = contadorUsuarios + 1; // Asignar un id único (basado en el contador de usuarios)
//        this.email = email;
//        this.nombreCompleto = nombreCompleto;
//        this.DNI = DNI;
//        this.edad = edad;
//        this.telefono = telefono;
//        contadorUsuarios++;// Incrementar el contador de usuarios
//    }