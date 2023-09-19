package HomeWork;

import java.util.List;

public class TeacherView<T extends Teacher> implements UserView<T> {
    @Override
    public void sendOnConsole(List<T> teachers) {
        for (T user : teachers) {
            System.out.println(user);
        }
    }
}
