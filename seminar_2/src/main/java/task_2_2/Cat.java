package task_2_2;

public abstract class Cat extends Animal {
    public static int countCat = 0;
    public static final int canRun = 200;

    public Cat(String name) {
        super(name);
        countCat++;
    }

    @Override
    public abstract void Run(int m);
//    {
//        if (m > canRun) {
//            System.out.println("Кот "+ name +" пробежал 200 метров и устал!");
//        } else if (m > 0 && canRun >= m) {
//            System.out.println("Кот "+ name +" пробежал " + m + " метров!");
//        } else {
//            System.out.println("Введено неверное значение расстояния!");
//        }
//    }

    @Override
    public abstract void Swim(int m);
//    {
//        System.out.println("Кот "+ name +" не умеет плавать!");
//    }
}
