/**
Task_1.
Создайте массив, в котором будут храниться кубы чисел от 1 до 1000. 
Затем вводятся 2 числа из этого диапазона. Используя данные из массива найдите их кубы.
Sample Input:
8
11
Sample Output:
512
1331
 */
import java.util.Scanner;
public class homeTask01 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int[] arr = new int[1000];
        for (int i = 0; i < 1000; i++) {
            arr[i] = (i + 1) * (i + 1) * (i + 1);
        }
        System.out.println("Введите число: ");
        int num = iScanner.nextInt();
        System.out.printf("Куб числа %d = %d", num, arr[num - 1]);
        iScanner.close();
    }
}