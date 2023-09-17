package modelCalculator;

import calculator.Operation;

public class SubtractionOperation implements Operation {
    private final Logger logger;

    public SubtractionOperation(Logger logger) {
        this.logger = logger;
    }

    @Override
    public String key() {
        return "-";
    }

    @Override
    public double calculate(double a, double b) {
        logger.log("Выполняется вычитание чисел " + a + " - " + b);
        return a - b;
    }
}
