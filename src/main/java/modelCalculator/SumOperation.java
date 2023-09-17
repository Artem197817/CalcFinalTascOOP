package modelCalculator;


import calculator.Operation;

public class SumOperation implements Operation {
    @Override
    public String key() {
        return "+";
    }

    @Override
    public double calculate(double a, double b) {
        return a+b;
    }
}
