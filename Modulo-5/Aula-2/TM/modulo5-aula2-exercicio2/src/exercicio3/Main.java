package exercicio3;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Novo Livro", "1245234235", "Autor");
        System.out.println(book.getTitulo());
        System.out.println(book.toString());
    }
}
