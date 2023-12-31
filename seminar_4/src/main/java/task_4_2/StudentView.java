package task_4_2;
import java.util.List;
import task_4_1.Student;

public class StudentView<T extends Student> implements UserView<T>{
    public void sendOnConsole(List<T> students) {
        for(T user: students){
            System.out.println(user);
        }
    }
}
