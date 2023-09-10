package task_2_3;

public class Car implements Transport {
    @Override
    public void Run() {
        System.out.println("Машина едет");
    }
    @Override
    public void Stop() {
        System.out.println("Машина стоит");
    }
}
