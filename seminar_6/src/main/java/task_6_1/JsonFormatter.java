package task_6_1;

public class JsonFormatter implements Formatter{
    @Override
    public void formatTo(Book book) {
        System.out.println("Книга преобразована в Json");
    }
}
