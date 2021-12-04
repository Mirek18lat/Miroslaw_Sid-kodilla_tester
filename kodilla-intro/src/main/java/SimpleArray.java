public class SimpleArray {
    public static void main(String[] args) {
        String[] names = new String[5];
        names[0] = "Mirek";
        names[1] = "Jasio";
        names[2] = "Klaudia";
        names[3] = "Jarek";
        names[4] = "Jacek";
        String name = names [3];
        System.out.println(name);
        int numberOfElements = names.length;
        System.out.println(numberOfElements);
    }
}