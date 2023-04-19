package KetTap;

public class Book {
    // Khai báo thuộc tính private
    private String isbn;
    private String name;
    private Author author;
    private float price;
    private  int quantity;

    //Phương thức tạo đối số
    public Book(String isbn, String name, Author author, float price, int quantity) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters và Setters
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return "Sách :" + name +
                " của tác giả " + author ;
    }
}
