package modelCalculator;


import calculator.Operation;

public class SumOperation implements Operation {
    private final Logger logger;

    public SumOperation(Logger logger) {
        this.logger = logger;
    }

    @Override
    public String key() {
        return "+";
    }

    @Override
    public double calculate(double a, double b) {
        logger.log("Выполняется сложение чисел " + a + " + " + b);
        return a + b;
    }
}
