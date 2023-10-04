package certification_OOP.model;

import certification_OOP.service.Calculable;
import certification_OOP.service.ICalculableFactory;
import certification_OOP.service.Logable;

public class CalculableFactoryLog implements ICalculableFactory {

    private Logable logger;

    public CalculableFactoryLog(Logable logger) {
        this.logger = logger;
    }

    @Override
    public Calculable create(int primaryArg) {
        return new CalculatorLog(new Calculator(primaryArg),logger);
    }
}
