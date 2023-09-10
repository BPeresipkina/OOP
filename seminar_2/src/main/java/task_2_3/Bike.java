package task_2_3;

public class Bike implements Transport {
    @Override
    public void Run() {
        System.out.println("Велосипед едет");
    }
    @Override
    public void Stop() {
        System.out.println("Велосипед стоит");
    }
}
