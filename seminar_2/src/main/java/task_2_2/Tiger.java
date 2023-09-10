package task_2_2;

public class Tiger extends Cat {
    public static int countTiger = 0;
    public static final int canRun = 2500;
    public static final int canSwim = 20;
    public Tiger(String name) {
        super(name);
        countTiger++;
    }

    @Override
    public void Run(int m) {
        if (m > canRun) {
            System.out.println("Тигр "+ name +" пробежала 500 метров и устала!");
        } else if (m > 0 && canRun >= m) {
            System.out.println("Тигр "+ name +" пробежала " + m + " метров!");
        } else {
            System.out.println("Введено неверное значение расстояния!");
        }
    }

    @Override
    public void Swim(int m) {
        if (m > canSwim) {
            System.out.println("Тигр "+ name +" проплыла 10 метров и устала!");
        } else if (m > 0 && canSwim >= m) {
            System.out.println("Тигр "+ name +" проплыла " + m + " метров!");
        } else {
            System.out.println("Введено неверное значение расстояния!");
        }
    }
}
