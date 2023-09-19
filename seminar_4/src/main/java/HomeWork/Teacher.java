package HomeWork;

public class Teacher extends User {
    private String object;
    private int experience;

    public Teacher(String name, int id, String object, int experience) {
        super(name, id);
        this.object = object;
        this.experience = experience;
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

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "object='" + object + '\'' +
                ", experience=" + experience +
                '}';
    }
}
