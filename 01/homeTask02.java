/**
Task_2.
Вводится число n, затем n чисел целых, по одному на каждой строке. 
Затем вводится число, на которое нужно умножить все введённые выше числа. 
Выведите на экран результат умножения построчно.
Sample Input:
4
1
2
3
5
2
Sample Output:
2
4
6
10
 */
import java.util.Scanner;
public class homeTask02 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int n = iScanner.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Введите %d-e число: ", i+1);
            array[i] = iScanner.nextInt();
        }
        System.out.println("Введите множитель: ");
        int k = iScanner.nextInt();
        for (int i : array) {
            System.out.printf("%d * %d = %d \n", i, k, i * k);
        }
        iScanner.close();
    }
}