package task_4_2;

import task_4_1.Student;
import task_4_1.StudentComparator;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements UserService<Student>{
    private List<Student> students;

    public StudentService() {
        this.students = new ArrayList<>();
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void create(String name, int id, int rating, int age) {
        Student student = new Student(name, id, rating, age);
        students.add(student);
    }
}
