package certification_OOP.model;

import certification_OOP.service.Calculable;
import certification_OOP.service.ICalculableFactory;

public class CalculableFactory implements ICalculableFactory {
    public Calculable create(int primaryArg) {
        return new Calculator(primaryArg);
    }
}
