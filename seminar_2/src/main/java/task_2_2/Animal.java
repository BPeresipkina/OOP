package task_2_2;

public abstract class Animal {
    String name;
    public static int count = 0;
    public Animal(String name) {
        this.name = name;
        count++;
    }
    public abstract void Run(int m);
    public abstract void Swim(int m);

}
