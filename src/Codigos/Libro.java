package Codigos;
public class Libro{
    private static int contadorLibros = 0;
    private int idLibro;
    private int añoPublicacion;
    private String titulo;
    private String autor;
    private String ISBN;
    private String editorial;
    private int copias;
    
    public Libro(int añoPublicacion, String titulo, String autor, 
            String ISBN, String editorial,int copias) {
        this.idLibro = contadorLibros+1;
        this.añoPublicacion = añoPublicacion;
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.editorial = editorial;
        this.copias = copias;
        contadorLibros++;
    }

    public static int getContadorLibros() {
        return contadorLibros;
    }

    public static void setContadorLibros(int contadorLibros) {
        Libro.contadorLibros = contadorLibros;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    
}
