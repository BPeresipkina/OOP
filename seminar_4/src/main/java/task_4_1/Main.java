package task_4_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("st1", 234, 10, 20);
        Student st2 = new Student("st2", 562, 7, 21);
        Teacher teach1 = new Teacher("teach1", 742, "Rus");
        Teacher teach2 = new Teacher("teach2", 42, "Math");
        List<User>listSt = new ArrayList<>();
        listSt.add(st1);
        listSt.add(st2);
        listSt.add(teach1);
        listSt.add(teach2);
//        listSt.sort(new StudentComparator());
        System.out.println(listSt);
        listSt.sort(new UserComparator<User>());
        System.out.println(listSt);
    }
}
