package view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ViewCalculator {

    @Autowired
    public ViewCalculator() {

    }

    public void sendMessage(String message) {
        System.out.println(message);
    }


    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    /**
     * Метод корректного ввода типа double
     */
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
