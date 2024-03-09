import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите первое число:");
        int firstNumber = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число:");
        int secondNumber = new Scanner(System.in).nextInt();

        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int productOfNumbers = firstNumber * secondNumber;
        double quotient = (double) firstNumber / secondNumber;

        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
        System.out.println("Произведение: " + productOfNumbers);
        System.out.println("Частное: " + quotient);
    }
}
