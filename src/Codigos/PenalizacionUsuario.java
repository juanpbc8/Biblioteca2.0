package Codigos;
import Interfaces.IPenalizable;
public class PenalizacionUsuario implements IPenalizable {
    private Usuario usuario;
    private int librosPerdidos;
    private double multaTotal;
    private String estadoSuspension;

    public PenalizacionUsuario(Usuario usuario, int librosPerdidos,
            double multaTotal, String estadoSuspension) {
        this.usuario = usuario;
        this.librosPerdidos = librosPerdidos;
        this.multaTotal = multaTotal;
        this.estadoSuspension = estadoSuspension;
    }

    @Override
    public void libroPerdido(Usuario usuario) {
        librosPerdidos++;
        multaTotal += MULTA_PERDIDA;
        if (librosPerdidos == 2) {
            estadoSuspension = SUSPENSION_DIAS;
        } else if (librosPerdidos >= 3) {
            estadoSuspension = SUSPENSION_PERMANENTE;
        }
        System.out.println(this.toString());
    }

    @Override
    public void libroDanado(Usuario usuario) {
        multaTotal += MULTA_DANIO;
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return super.toString() + ", libros perdidos: " + librosPerdidos + 
                ", multa total: " + multaTotal + 
                " soles, estado de suspensión: " + estadoSuspension;
    }
}
