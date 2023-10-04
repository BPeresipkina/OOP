package certification_OOP.service;

import certification_OOP.service.Calculable;

public interface ICalculableFactory {
    Calculable create(int primaryArg);
}
