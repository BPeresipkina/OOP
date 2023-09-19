package task_4_1;

public class Teacher extends User{
    private String object;

    public Teacher(String name, int id, String object) {
        super(name, id);
        this.object = object;
    }

    public Teacher(String name, int id) {
        super(name, id);
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "object='" + object + '\'' +
                '}';
    }
}
