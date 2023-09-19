package HomeWork;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements UserService<Student> {
    private List<Student> students;

    public StudentService() {
        this.students = new ArrayList<>();
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void create(String name, int id) {
        Student student = new Student(name, id);
        students.add(student);
    }

}
