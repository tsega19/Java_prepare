package Methods;

public class Book {
    String title;
    String author;
    double price;
  // Removed 'static' from here

    public Book(String titles, String author, double price) {
 title = titles;
        this.author = author;
        this.price = price;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public double getDiscountPrice(double discount) {
        if (discount>0 && discount<100){
            return  price -  price *discount/100;
        }
             return price;
    }
    public void displayDetails(){
        System.out.println("Title "+ title);
        System.out.println("Author "+ author);
        System.out.println("Price "+ price);
    }

    public static void main(String[] args) {
        Book b = new Book("Bord", "James", 12.3);  // 20% discount
        b.displayDetails();
        double d= b.getDiscountPrice(200);
        System.out.println("Discount Price "+ d );
    }
}
