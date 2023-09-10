package task_2_1;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public abstract void animalInfo();

    public abstract void voice();

    public abstract void jump();
}
