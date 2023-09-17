package view;

import calculator.Calculator;

import java.util.Scanner;

public class ViewCalculator {

    private final Calculator calculator;

    public ViewCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public void run() {
        double a = promptDouble("Введите первое число ");
        String opr = prompt("Введите выполняемую операцию ").trim();
        double b = promptDouble("Введите второе число ");
        try {
            System.out.println("Результат вычмслений " + a + opr + b + " = " + calculator.calculate(a, b, opr));
        }catch (UnsupportedOperationException e){
            System.out.println("Введенная операция не поддерживается");
        }
    }


    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private double promptDouble(String message) {
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
