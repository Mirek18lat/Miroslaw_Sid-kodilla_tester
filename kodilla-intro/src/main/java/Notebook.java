public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook (int  weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;

    }
    public void checkPrice() {
        if (this.price<600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600  && this.price > 1000) {
            System.out.println("The price is good.");
        } else
            System.out.println("This notebook is quite expensive.");
    }
    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("This notebook is light.");
        } else if (this.weight > 1001  && this.weight > 1999) {
            System.out.println("The notebook isn't too heavy.");
        } else
            System.out.println("This notebook is very heavy.");
    }


    public void checkPriceYear() {
        if (this.price < 700 && this.year < 2015) {
            System.out.println("Don't buy it!");
        } else if (this.price < 700 && this.year > 2016 && this.year < 2019) {
            System.out.println("The price is good.");
        } else if (this.price < 700 && this.year > 2020) {
            System.out.println("Buy it now!");
        } else if (this.price > 701 && this.price < 3000 && this.year < 2015) {
            System.out.println("The price is height.");
        } else if (this.price > 701 && this.price < 3000 && this.year > 2016 && this.year < 2019) {
            System.out.println("The price is good .");
        } else if (this.price > 701 && this.price < 3000 && this.year > 2020) {
            System.out.println("Buy it now!");
        } else if (this.price > 4999 && this.year < 2015) {
            System.out.println("The price is irrational!");
        } else if (this.price > 4999 && this.year > 2016 && this.year < 2019) {
            System.out.println("The price is to height.");
        } else {
            System.out.println("The price is normal");
        }
    }
}