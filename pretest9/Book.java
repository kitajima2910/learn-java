package allbaitapjava2.pretest9;

public class Book {

    private String bookID;
    private String Category;
    private String title;
    private String author;
    private int price;

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Book(String bookID, String Category, String title, String author, int price) {
        this.bookID = bookID;
        this.Category = Category;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book() {

    }

    @Override
    public String toString() {
        return "Book[" + "bookID: " + bookID + ", Category: " + Category + ", title: " + title + ", author: " + author + ", price: " + price + ']';
    }

}
