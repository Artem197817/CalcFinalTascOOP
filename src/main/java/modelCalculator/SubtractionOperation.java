package modelCalculator;

import calculator.Operation;

public class SubtractionOperation implements Operation {
    @Override
    public String key() {
        return "-";
    }

    @Override
    public double calculate(double a, double b) {
        return a-b;
    }
}
