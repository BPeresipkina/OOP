package HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TeacherService teachServ = new TeacherService();
        teachServ.create("teach1", 1);
        teachServ.create("teach2", 2);
        teachServ.create("teach3", 3);
        teachServ.create("teach4", 4);
        System.out.println(teachServ.getAll());

        List<Teacher> listT = new ArrayList<>(Arrays.asList
                (new Teacher("teach01", 10, "Rus", 7),
                        new Teacher("teach02", 41, "Math", 13),
                        new Teacher("teach03", 4, "Sport", 3)));
        listT.sort(new TeacherComparator());
        System.out.println(listT);
    }
}
