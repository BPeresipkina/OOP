package task_2_3;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Human human = new Human();
        human.start(car);
        human.start(car);
        human.finish(car);
        human.finish(car);
        Skate skate = new Skate();
    }
}
