/**
Task_3.
Реализовать простой калькулятор (+,-,=,*), только с целыми числами.
 */
import java.util.Scanner;
public class homeTask03 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("\nКалькулятор\n");
        System.out.println("Введите число A: ");
        int a = iScanner.nextInt();
        System.out.println("Введите операцию (+, -, *, /): ");
        char op = iScanner.next().charAt(0);
        System.out.println("Введите число B: ");
        int b = iScanner.nextInt();
        iScanner.close();
        switch (op) {
            case '+':
            System.out.printf("%d + %d = %d \n", a, b, a + b);
            break;
            case '-':
            System.out.printf("%d - %d = %d \n", a, b, a - b);
            break;
            case '*':
            System.out.printf("%d * %d = %d \n", a, b, a * b);
            break;
            case '/':
            System.out.printf("%d / %d = %d \n", a, b, a / b);
            break; }
    }
}