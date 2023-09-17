package modelCalculator;

import calculator.Operation;

public class MultiplyOperation implements Operation {

    private final Logger logger;

    public MultiplyOperation(Logger logger) {
        this.logger = logger;
    }

    @Override
    public String key() {
        return "*";
    }

    @Override
    public double calculate(double a, double b) {
        logger.log("Выполняется умножение чисел " + a + " * " + b);
        return a * b;
    }
}
