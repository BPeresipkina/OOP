package task_6_1;

import java.util.ArrayList;
import java.util.List;

public class Library implements Searchable{
    public List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> booksByAuthor = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).getAuthor().equals(author)){
                booksByAuthor.add(books.get(i));
            }
        }
        return booksByAuthor;
    }
}
