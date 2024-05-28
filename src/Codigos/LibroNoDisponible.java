package Codigos;
public class LibroNoDisponible extends Libro {
    public LibroNoDisponible(int añoPublicacion, String titulo,
            String autor, String ISBN, String editorial, int copias) {
        super(añoPublicacion, titulo, autor, ISBN, editorial, copias);
    }                           
    @Override
    public String toString(){
        return "Titulo:" + getTitulo() +
                "Autor:" + getAutor() +
                "ISBN:" + getISBN()+
                "Editorial:" + getEditorial()+
                "Año De Publicacion:" + getAñoPublicacion()+
                "Copias:" + getCopias();
    }
}
