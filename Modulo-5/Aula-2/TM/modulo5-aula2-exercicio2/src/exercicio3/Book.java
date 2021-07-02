package exercicio3;

public class Book {

    private String titulo;
    private String ISBN;
    private String autor;

    public Book(String titulo, String ISBN, String autor) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.autor = autor;
    }

    public Book() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String toString(){
        return  titulo + ", " + ISBN + ", " + autor;
    }

    /* Erro pois a superclass não implementa o método tostring
    @Override
    public String tostring(){
        return  titulo + ", " + ISBN + ", " + autor;
    }
    */
}
