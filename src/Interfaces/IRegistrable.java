package Interfaces;
import Codigos.RegistroTransacciones;
import java.util.ArrayList;

public interface IRegistrable {
    public static ArrayList<RegistroTransacciones> listaPrestamoLibro = new ArrayList<>();
    public abstract void agregarPrestamo(RegistroTransacciones registro);
    public abstract void eliminarPrestamo(RegistroTransacciones registro);
}

