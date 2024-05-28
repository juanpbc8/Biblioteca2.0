package Codigos;
import java.util.ArrayList;
public class Biblioteca {
    public static ArrayList<LibroDisponible> librosDisponibles = new ArrayList<>();
    public static ArrayList<LibroNoDisponible> librosNoDisponibles = new ArrayList<>();
    public static ArrayList<Bibliotecario> bibliotecarios = new ArrayList<>();
    public static ArrayList<Usuario> usuarios = new ArrayList<>();
    //Verificar si existe usuario por dni
    public static boolean existeUsuarioPorDni(String dni){
        for(Usuario usuario: usuarios){
            if(usuario.getDNI().equals(dni)){
                return true;
            }
        }
        return false;
    }
    //Obtener usuario con dni
    public static Usuario obtenerUsuarioPorDni(String dni) {
        for (Usuario usuario : usuarios) {
            if (usuario.getDNI().equals(dni)) {
                return usuario;
            }
        }
        return null;
    }
}
