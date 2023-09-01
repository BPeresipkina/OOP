package task_1_1;

public class Animal {
    // Переопределить методы у класса наследника (анотация - @override)
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public void animalInfo() {
        System.out.println("Животное = " + name);

    }

    public void voice() {
        System.out.println("Животное " + name + " издает звук!");
    }

    public void jump() {
        System.out.println("Животное " + name + " прыгнуло!");
    }
}
