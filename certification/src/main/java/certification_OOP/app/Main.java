package certification_OOP.app;

import certification_OOP.model.ConsoleLogger;
import certification_OOP.service.ICalculableFactory;
import certification_OOP.model.CalculableFactoryLog;
import certification_OOP.controler.ViewCalculator;

public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new CalculableFactoryLog(new ConsoleLogger());
        ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();
    }
}
