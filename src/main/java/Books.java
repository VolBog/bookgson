import java.util.Arrays;

public class Books {
    private Book[] books;

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Books{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
