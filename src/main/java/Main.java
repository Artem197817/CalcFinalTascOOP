import calculator.Calculator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.CreateComplexNumber;
import modelCalculator.*;
import view.ViewCalculator;

public class Main {
    /**
     * Создать проект калькулятора комплексных чисел (достаточно сделать сложение, умножение и деление).
     * Применить при создании программы архитектурные паттерны, добавить логирование калькулятора.
     * Соблюдать принципы SOLID, паттерны проектирования.
     */
    public static void main(String[] args) {


        var context = new AnnotationConfigApplicationContext(CalculatorConfig.class);
        var viewCalculator = context.getBean(ViewCalculator.class);
        CreateComplexNumber factoryComplexNumber = new CreateComplexNumber(viewCalculator);
        System.out.println("Введите первое число ");
        ComplexNumber firstNumber = factoryComplexNumber.create();
        System.out.println("Введите второе число ");
        ComplexNumber secondNumber = factoryComplexNumber.create();
        var calculator = context.getBean(Calculator.class);
        calculator.run(firstNumber, secondNumber);

    }
}
