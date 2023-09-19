package task_4_2;

import java.util.List;

public interface UserService<T> {
    public List<T> getAll();
    public void create(String name, int id, int rating, int age);

}
