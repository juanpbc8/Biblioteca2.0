package Interfaces;
import Codigos.Usuario;

public interface IPenalizable {
    final double MULTA_PERDIDA = 100; 
    final double MULTA_DANIO = 50;
    final String SUSPENSION_DIAS = "30 dias";
    final String SUSPENSION_PERMANENTE = "Permanente";
    
    public abstract void libroPerdido(Usuario usuario);
    public abstract void libroDanado(Usuario usuario);
}

