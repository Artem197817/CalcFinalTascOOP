package view;

import calculator.Calculator;
import modelCalculator.ComplexNumber;
import modelCalculator.Logger;

import java.util.Comparator;
import java.util.Scanner;

public class ViewCalculator {

    private final Calculator calculator;
    private final Logger logger;

    public ViewCalculator(Calculator calculator, Logger logger) {
        this.calculator = calculator;
        this.logger = logger;
    }

    public void run(ComplexNumber firstNumber, ComplexNumber secondNumber) {
        String opr = prompt("Введите выполняемую операцию ").trim();
        logger.log("Передаем для вычисления выражение" + firstNumber + " " + opr + " " + secondNumber);
        try {
            String message = "Результат вычмслений " + firstNumber + " " + opr + " " + secondNumber + " = "
                    + calculator.calculate(firstNumber, secondNumber, opr);
            System.out.println(message);
            logger.log(message);
        } catch (UnsupportedOperationException e) {
            String msg = "Введенная операция не поддерживается";
            System.out.println(msg);
            logger.log(msg);
        }
    }


    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    public double promptDouble(String message) {
        double result;
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        try {
            result = Double.parseDouble(in.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат числа. Введите число еще раз");
            result = promptDouble(message);
        }
        return result;
    }
}
