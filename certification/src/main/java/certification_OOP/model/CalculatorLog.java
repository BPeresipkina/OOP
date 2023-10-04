package certification_OOP.model;

import certification_OOP.service.Calculable;
import certification_OOP.service.Logable;

public class CalculatorLog implements Calculable {

    private Calculable decorated;
    private Logable logger;

    public CalculatorLog(Calculable decorated, Logable logger) {
        this.decorated = decorated;
        this.logger = logger;
    }

    @Override
    public Calculable sum(int arg) {
        logger.log("вызвался метод суммы с параметром : " + arg);
        return decorated.sum(arg);
    }

    @Override
    public Calculable multi(int arg) {
        logger.log("вызвался метод умножения с параметром : " + arg);
        return decorated.multi(arg);
    }

    @Override
    public Calculable divide(int arg) {
        logger.log("вызвался метод деления с параметром : " + arg);
        return decorated.divide(arg);
    }

    @Override
    public int getResult() {
        logger.log("пользователь запросил результат!");
        return decorated.getResult();
    }
}
