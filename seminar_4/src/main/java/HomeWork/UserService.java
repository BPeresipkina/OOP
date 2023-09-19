package HomeWork;

import java.util.List;

public interface UserService<T> {
    public List<T> getAll();
    public void create(String name, int id);

}
