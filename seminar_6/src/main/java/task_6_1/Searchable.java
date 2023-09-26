package task_6_1;

import java.util.List;

public interface Searchable {
    public List<Book> findByAuthor(String author);
}
