import java.util.Scanner;

public class Book {
    private String author;
    private String title;
    public static String of(String author, String title) {
        return author + title;
    }

    public static void main(String[] args) {
        String book = Book.of("Isaac Asimov", "The Galaxy" );
        System.out.println(book);
    }
}
