package task_2_2;

public class Dog extends Animal {
    public static int countDog = 0;
    public static final int canRun = 500;
    public static final int canSwim = 10;

    public Dog(String name) {
        super(name);
        countDog++;
    }

    @Override
    public void Run(int m) {
        if (m > canRun) {
            System.out.println("Собака "+ name +" пробежала 500 метров и устала!");
        } else if (m > 0 && canRun >= m) {
            System.out.println("Собака "+ name +" пробежала " + m + " метров!");
        } else {
            System.out.println("Введено неверное значение расстояния!");
        }
    }

    @Override
    public void Swim(int m) {
        if (m > canSwim) {
            System.out.println("Собака "+ name +" проплыла 10 метров и устала!");
        } else if (m > 0 && canSwim >= m) {
            System.out.println("Собака "+ name +" проплыла " + m + " метров!");
        } else {
            System.out.println("Введено неверное значение расстояния!");
        }
    }

}
