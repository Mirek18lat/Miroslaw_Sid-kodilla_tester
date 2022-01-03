import java.util.Scanner;
public class Colour {
    public static String getSelectedColour() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select calculation (B -  Black, W - White, G - Green, Y - Yellow, R - Red):");
            String calc = scanner.nextLine().trim().toUpperCase();
            switch (calc) {
                case "B": return "Black";
                case "W": return "White";
                case "G": return "Green";
                case "Y": return "Yellow";
                case "R": return "Red";
                default:
                    System.out.println("Wrong calculation. Try again.");
            }
        }
    }
    public static void main(String[] args) {
        Colour colour = new Colour();
        String result = colour.getSelectedColour();
        System.out.println("Your coulur " + result);
    }
}
