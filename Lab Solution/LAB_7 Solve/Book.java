public class Book {
     String title;
     String auth;
     int price;
    public Book(String title) {
        this.title = title;
    }
    public Book(String title, String auth) {
        this.title = title;
        this.auth = auth;
    }
    public Book(String title, String auth, int price) {
        this.title = title;
        this.auth = auth;
        this.price = price;
    }
    public void setDetails(int price) {
        this.price = price;
    }
    public void setDetails(String auth, int price) {
        this.auth = auth;
        this.price = price;
    }
    public void displayDetails() {
        if (auth == null && price == 0) {
            System.out.println("Title: " + title);
        } 
        else if (price == 0) {
            System.out.println("Title: " + title + ", Author: " + auth);
        } 
        else if (auth == null) {
            System.out.println("Title: " + title + ", Price: " + price);
        } 
        else {
            System.out.println("Title: " + title + ", Author: " + auth + ", Price: " + price);
        }
    }
}
