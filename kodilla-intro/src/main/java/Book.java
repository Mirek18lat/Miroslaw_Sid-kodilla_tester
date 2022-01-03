import java.util.Scanner;

public class Book {
    private String author;
    private String title;
    public static String of() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter name of author of the book");
            String author = scanner.nextLine().trim();
            if (author.length() >= 2) {
                return author;
            }
            System.out.println("Name of Author is too short. Try again.");
            Scanner scanner2 = new Scanner(System.in);
        }
    }
    public static String of2() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter name of the book");
            String title = scanner.nextLine().trim();
            if (title.length() >= 2) {
                return title;
            }
            System.out.println("Name is too short. Try again.");
        }
    }
    public static void main(String[] args) {
        String autor = Book.of();
        String title = Book.of2();
        System.out.println("Your book is: <" + autor + "> written by <" + title +">");
    }
}
