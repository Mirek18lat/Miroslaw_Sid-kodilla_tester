public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook= new Notebook(600, 2000, 2021);
        System.out.println(notebook.weight  + "  " + notebook.price  + "  " + notebook.year);
        notebook.checkPrice();
        notebook.checkPriceYear();

        Notebook heavyNotebook = new Notebook ( 2000, 5000, 2015);
        System.out.println(heavyNotebook.weight + "  " + heavyNotebook.price + "  " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkPriceYear();

        Notebook oldNotebook = new Notebook (  1200, 600, 2014);
        System.out.println(oldNotebook.weight + "  " + oldNotebook.price + "  " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkPriceYear();
    }
}