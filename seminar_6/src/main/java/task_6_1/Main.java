package task_6_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>(Arrays.asList(
                new Book("LOTR", "Tolkien", new BookGenre("Fantasy")),
                new Book("Knife","Nesbe",new BookGenre("Detective")),
                new Book("Stranger people", "Bakman",new BookGenre("Prosa")),
                new Book("Sapience", "Harary", new BookGenre("Non-fiction"))));
        Library library = new Library(books);
        Book sp = new Book("Stranger people", "Bakman",new BookGenre("Prosa2"));
        System.out.println(library.findByAuthor("Bakman"));
        Formatter formatter = new JsonFormatter();
        formatter.formatTo(sp);
    }
}
