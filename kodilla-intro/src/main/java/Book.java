public class Book {
    private String author;
    private String title;

    public static String of(String author, String title) {
        String book = Book.of("Isaac Asimov", "The Galaxy");
        return book;
    }
}