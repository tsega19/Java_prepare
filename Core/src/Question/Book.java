package Question;

import java.util.Objects;

public class Book {
    String title = "Unknown";
    String author= "Unknown";
    double price= 0.0;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public Book(String titles, String authors){
        this.title = titles;
        this.author = authors;
    }

    public boolean  displayInfo(){
       if(price.notEmpty){
           System.out.println(true);
       }
       else {
           System.out.println(false);
       }
       return true;
    }

    public static void main(String[] args) {
        Book b = new Book("emengua", "Birhaunu", 23.4);
        Book b1 = new Book("emengua", "burhanu");
        b.displayInfo();
        b1.displayInfo();
    }
}

