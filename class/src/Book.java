/*4 - Crie uma classe Livro com os atributos título, autor e ano de publicação.
Imprima as informações do livro na tela. */

public class Book {
    public String title = "Clean code";
    public String author= "John Dow";
    public int year= 1999;

    public static void main(String[] args) {
        Book book = new Book();

        System.out.println("O titulo do livro -> "+book.title);
        System.out.println("O autor do livro -> "+book.author);
        System.out.println("O ano do livro -> "+book.year);
    }
}
