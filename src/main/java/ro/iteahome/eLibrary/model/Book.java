package ro.iteahome.eLibrary.model;

public class Book {
    private int BookId;
    private String name;
    private int authorId;
    private int numberOf;

    public Book(int bookId, String name, int authorId, int numberOf) {
        BookId = bookId;
        this.name = name;
        this.authorId = authorId;
        this.numberOf = numberOf;
    }

    public int getBookId() {
        return BookId;
    }

    public void setBookId(int bookId) {
        BookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public int getNumberOf() {
        return numberOf;
    }

    public void setNumberOf(int numberOf) {
        this.numberOf = numberOf;
    }
}
