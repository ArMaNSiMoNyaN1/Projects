package arman.library;

public class Book extends Item {
    private String name;
    private String author;
    private String publisher;
    private int isbn;

    public Book(String name, String author, String publisher, int isbn) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String publisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public  int getIsbn(){
        return  isbn;
    }
    public  void setIsbn(int isbn){
        this.isbn=isbn;
    }

}
