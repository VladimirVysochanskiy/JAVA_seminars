/**
Вам дается строка S и целочисленный массив индексов int index[s.length].
Напишите программу, которая перетасует символы в S таким образом,
что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
Пример: s = “cba”, index = [3,2,1] 
result “abc”
*/
// import java.util.Scanner;
public class homeTask01 {

    static String shuffle(final String s, final int[] index) {
        String result = "";
        for (int i = 0; i < index.length; i++) {
            if (index[i] > s.length()) {
                continue;
            }
            else {
                result = result + s.charAt(index[i] - 1);
            }
        }
        return result;
    }


    public static void main(String[] args) {
        String s = "qwerty";
        int index[] = {5,5,10,10,3,3};

        System.out.println(shuffle(s, index));
    }
}