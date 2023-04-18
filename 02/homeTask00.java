/**
Посчитайте сколько драгоценных камней в куче обычных камней
Пример:
jewels = “aB”, stones = “aaaAbbbB”
Результат в консоль ”a3B1”
*/

import java.util.Scanner;
public class homeTask00 {

    static String findJewelsInStones(String jewels, String stones) {
        String result = "";
        for (int i = 0; i < jewels.length(); i++) {
            int count = 0;
            for (int j = 0; j < stones.length(); j++) {
                if (jewels.charAt(i) == stones.charAt(j)) {
                    count++;
                }
            }
            result = result + jewels.charAt(i) + count;
        }            
        return result;
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Jewels: ");
        String jewels = iScanner.next();
        System.out.println("Stones: ");
        String stones = iScanner.next();
        iScanner.close();

        System.out.println(findJewelsInStones(jewels, stones));

    }
}