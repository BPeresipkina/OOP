package HomeWork;

public class Student extends User {

    private int rating;
    private int age;

    public Student(String name, int id, int rating, int age) {
        super(name, id);
        this.rating = rating;
        this.age = age;
    }

    public Student(String name, int id) {
        super(name, id);
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rating=" + rating +
                ", age=" + age +
                '}';
    }
}
