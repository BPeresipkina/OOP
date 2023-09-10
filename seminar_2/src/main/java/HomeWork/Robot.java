package HomeWork;

public class Robot extends Creatures {
    private final int maxRun = 300;
    private final int maxJamp = 2;

    public Robot(String name) {
        super(name);
    }

    @Override
    protected int Run(int max) {
        if (max>maxRun){
            return 0;
//            System.out.println("Робот не добежал!");
        } else {
            return 1;
//            System.out.println("Робот бежит!");
        }
    }

    @Override
    protected int Jump(int max) {
        if (max>maxJamp){
            return 0;
//            System.out.println("Робот не допрыгнул!");
        } else {
            return 1;
//            System.out.println("Робот прыгнул!");
        }
    }

    @Override
    public String toString() {
        return "Robot{" +
                name +
                '}';
    }
}
