import calculator.Calculator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.CreateComplexNumber;
import modelCalculator.*;


public class Main {
    /**
     * Создать проект калькулятора комплексных чисел (достаточно сделать сложение, умножение и деление).
     * Применить при создании программы архитектурные паттерны, добавить логирование калькулятора.
     * Соблюдать принципы SOLID, паттерны проектирования.
     */
    public static void main(String[] args) {


        var context = new AnnotationConfigApplicationContext(CalculatorConfig.class);
        var createComplexNumber = context.getBean(CreateComplexNumber.class);
        System.out.println("Введите первое число ");
        ComplexNumber firstNumber = createComplexNumber.create();
        System.out.println("Введите второе число ");
        ComplexNumber secondNumber = createComplexNumber.create();
        var calculator = context.getBean(Calculator.class);
        calculator.run(firstNumber, secondNumber);

    }
}
