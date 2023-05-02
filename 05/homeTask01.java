/**
Реализуйте структуру телефонной книги с помощью HashMap, учитывая, 
что 1 человек может иметь несколько телефонов.
*/
import java.util.*;

public class homeTask01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "Windows-1251");    
        Map<String, String> phone_Book = new HashMap<>();

                   
        phone_Book.put("79055555555", "Василий Петров");
        phone_Book.put("79057777777", "Василий Сергеев");
        phone_Book.putIfAbsent("79057777776", "Сергей Петров");
        
        System.out.println("Для поиска введите номер телефона (7xxxxxxxxxx) или Имя и Фамилию абонента через пробел: ");
        String s = input.next();
        
        Search_Num(s, phone_Book);
        
        
    }
    
    static void Search_Num(String s, Map<String, String> hMap) {
        System.out.println(s);
        for (var item : hMap.entrySet()) {
            if (item.getValue().toLowerCase().contains(s.toLowerCase())) {
                System.out.println(item.getValue() + " " + item.getKey());
            }
            else if (isNumber((s.replaceAll("\\D+", ""))) && (item.getKey().contains(s.replaceAll("\\D+", "")))) {
                System.out.println(item.getValue() + " " + item.getKey());
            }
        }
    }
    
    static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}

