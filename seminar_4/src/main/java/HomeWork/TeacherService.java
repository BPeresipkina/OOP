package HomeWork;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher>{
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }
    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String name, int id) {
        Teacher teacher = new Teacher(name, id);
        teachers.add(teacher);
    }

    public void change(){
        //TODO изменение любой записи

    }
}
