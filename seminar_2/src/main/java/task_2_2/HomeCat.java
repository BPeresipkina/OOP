package task_2_2;

public class HomeCat extends Cat {
    public static int countHomeCat = 0;
    public HomeCat(String name) {
        super(name);
        countHomeCat++;
    }

    @Override
    public void Run(int m) {
        System.out.println("Домашний кот "+ name +" пробежал сколько-то метров!");
    }

    @Override
    public void Swim(int m) {
        System.out.println("Домашний кот "+ name +" не умеет плавать!");
    }
}
