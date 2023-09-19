package task_4_2;

import task_4_1.User;

import java.util.List;

public interface UserView<T extends User> {
    public void sendOnConsole(List<T> users);
}
