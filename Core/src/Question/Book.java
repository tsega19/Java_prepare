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

    public boolean  displayInfo(){

        return true;
    }
}

