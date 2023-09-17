import calculator.Calculator;
import modelCalculator.Logger;
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
        Logger logger = new Logger();
        Calculator calculator = new Calculator(List.of(new SumOperation(logger),
                new SubtractionOperation(logger), new MultiplyOperation(logger)));
        ViewCalculator viewCalculator = new ViewCalculator(calculator, logger);
        viewCalculator.run();

    }
}
