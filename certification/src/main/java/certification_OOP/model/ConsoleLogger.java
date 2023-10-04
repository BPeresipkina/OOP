package certification_OOP.model;

import certification_OOP.service.Logable;

public class ConsoleLogger implements Logable {
    @Override
    public void log(String message) {
        System.out.println(" LOG :  " + message);
    }
}
