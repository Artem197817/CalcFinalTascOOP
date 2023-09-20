package calculator;

import modelCalculator.ComplexNumber;
import view.ViewCalculator;

public class FactoryComplexNumber {

    public ViewCalculator viewCalculator;

    public FactoryComplexNumber(ViewCalculator viewCalculator) {
        this.viewCalculator = viewCalculator;
    }

    public ComplexNumber create() {
        double realPart = viewCalculator.promptDouble("Введите реальную часть ");
        double imaginaryPart = viewCalculator.promptDouble("Введите мнимую часть ");
        return new ComplexNumber(realPart, imaginaryPart);
    }
}
