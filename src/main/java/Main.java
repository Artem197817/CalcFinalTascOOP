import calculator.Calculator;
import modelCalculator.MultiplyOperation;
import modelCalculator.SubtractionOperation;
import modelCalculator.SumOperation;
import view.ViewCalculator;

import java.util.List;

public class Main {
    /**
     * Создать проект калькулятора комплексных чисел (достаточно сделать сложение, умножение и деление).
     * Применить при создании программы архитектурные паттерны, добавить логирование калькулятора.
     * Соблюдать принципы SOLID, паттерны проектирования.
     */
    public static void main(String[] args) {
        Calculator calculator = new Calculator(List.of(new SumOperation(),new SubtractionOperation(),new MultiplyOperation()));
        ViewCalculator viewCalculator = new ViewCalculator(calculator);
        viewCalculator.run();

    }
}
