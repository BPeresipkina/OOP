package task_2_3;

public class Human {
    private Transport currentTransport;

    public void start(Transport transport) {
        if (currentTransport == null) {
            transport.Run();
            currentTransport= transport;
        } else {
            System.out.println("Уже движемся!");
        }
    }

    public void finish(Transport transport) {
        if (currentTransport != null){
            transport.Stop();
            currentTransport = null;
        } else {
            System.out.println("Еще не начали движение!");
        }
    }
//    public void startSkate(Skate skate) {
//        if (lastSkate == null) {
//            skate.Run();
//            lastSkate = skate;
//        } else {
//            System.out.println("Машина уже едет!");
//        }
//    }
//
//    public void finishSkate(Skate skate) {
//        if (lastSkate != null){
//            skate.Stop();
//            lastSkate = null;
//        } else {
//            System.out.println("Машина еще не начала ехать!");
//        }
//    }
}
