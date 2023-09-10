package HomeWork;

public class Human extends Animal {
    private final int maxRun = 500;
    private final int maxJamp = 1;

    public Human(String name) {
        super(name);
    }

    @Override
    protected int Run(int max) {
        if (max>maxRun){
            return 0;
//            System.out.println("Человек не добежал!");
        } else {
            return 1;
//            System.out.println("Человек бежит!");
        }
    }

    @Override
    protected int Jump(int max) {
        if (max>maxJamp){
            return 0;
//            System.out.println("Человек не допрыгнул!");
        } else {
            return 1;
//            System.out.println("Человек прыгнул!");
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                name +
                '}';
    }
}
