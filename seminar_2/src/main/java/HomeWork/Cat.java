package HomeWork;

public class Cat extends Animal {
    private final int maxRun = 200;
    private final int maxJamp = 5;

    public Cat(String name) {
        super(name);
    }

    @Override
    protected int Run(int max) {
        if (max>maxRun){
            return 0;
//            System.out.println("Кот не добежал!");
        } else {
            return 1;
//            System.out.println("Кот бежит!");
        }
    }

    @Override
    protected int Jump(int max) {
        if (max>maxJamp){
            return 0;
//            System.out.println("Кот не допрыгнул!");
        } else {
            return 1;
//            System.out.println("Кот прыгнул!");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                name +
                '}';
    }
}
