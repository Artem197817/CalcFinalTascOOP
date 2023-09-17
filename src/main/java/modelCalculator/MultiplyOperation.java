package modelCalculator;

import calculator.Operation;

public class MultiplyOperation implements Operation {
    @Override
    public String key() {
        return "*";
    }

    @Override
    public double calculate(double a, double b) {
        return a*b;
    }
}
