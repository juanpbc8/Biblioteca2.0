package Codigos;
public class Bibliotecario {
    private static int contadorBibliotecarios = 0;
    private int idBibliotecario;
    private String nombreCompleto;
    private String email;
    private int edad;
    private int dni;
    private String contrasena;
    
    public Bibliotecario(String nombreCompleto, String email, int edad,
            String contrasena, int dni) {
        this.idBibliotecario = contadorBibliotecarios + 1;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.edad = edad;
        this.contrasena = contrasena;
        this.dni = dni;
        contadorBibliotecarios++;
    }

    public int getIdBibliotecario() {
        return idBibliotecario;
    }

    public void setIdBibliotecario(int idBibliotecario) {
        this.idBibliotecario = idBibliotecario;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getContrasena() {
        return contrasena;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    
    public static int getContadorBibliotecarios() {
        return contadorBibliotecarios;
    }

    public static void setContadorBibliotecarios(int contadorBibliotecarios) {
        Bibliotecario.contadorBibliotecarios = contadorBibliotecarios;
    }
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   
    }
}



        
