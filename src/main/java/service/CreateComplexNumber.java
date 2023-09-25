package service;

import modelCalculator.ComplexNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import view.ViewCalculator;

@Service
public class CreateComplexNumber {

    public ViewCalculator viewCalculator;

    @Autowired
    public CreateComplexNumber(ViewCalculator viewCalculator) {
        this.viewCalculator = viewCalculator;
    }

    public ComplexNumber create() {
        double realPart = viewCalculator.promptDouble("Введите реальную часть ");
        double imaginaryPart = viewCalculator.promptDouble("Введите мнимую часть ");
        return new ComplexNumber(realPart, imaginaryPart);
    }
}
