package Codigos;
public abstract class Persona {
    protected int id = 0;
    protected String nombreCompleto;
    public Persona(String nombreCompleto) {
        this.id++;
        this.nombreCompleto = nombreCompleto;
    }

    public abstract void registrar();
    public abstract void eliminar();

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
