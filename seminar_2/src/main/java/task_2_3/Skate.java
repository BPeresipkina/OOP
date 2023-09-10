package task_2_3;

public class Skate implements Transport {
    @Override
    public void Run() {
        System.out.println("Скейт едет");
    }
    @Override
    public void Stop() {
        System.out.println("Скейт стоит");
    }
}
