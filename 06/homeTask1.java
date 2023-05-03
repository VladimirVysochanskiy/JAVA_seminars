/*
Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.
Создать множество ноутбуков.

Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет 
ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:

“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объём ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */

import java.util.*;

public class homeTask1 {
    public static void main(String[] args) {

        laptop MsiGf63Thin = new laptop("Notebook", "MSI", "GF63", 15.6, "Core i5 11400H", 6, 2700, 8, 256, null);
        laptop MsiRaiderGe77 = new laptop("Notebook", "MSI", "Raider GE77", 17.3, "Core i7 12800HX", 16, 4800, 32, 2000, "Windows 11 Home");
        laptop LenovoLegion5 = new laptop("Notebook", "Lenovo", "Legion 5", 15.6, "AMD Ryzen 5", 6, 3300, 32, 512, null);
        laptop AppleMacBookPro16 = new laptop("Notebook", "Apple", "Macbook Pro 16", 16.2, "Apple M1 Max", 10, 3200, 32, 1000, "macOS");
        laptop AcerAspire3 = new laptop("Notebook", "Acer", "ASPIRE 3", 15.6, "AMD A9 9420e", 2, 1800, 6, 1000, "Windows 10 Home");
        laptop AsusRogStrixG18 = new laptop("Notebook", "Asus", "ROG Strix G18", 18, "Core i9 13980HX", 24, 2200, 16, 1000, null);

        MsiGf63Thin.outAll();
        MsiRaiderGe77.outAll();
        LenovoLegion5.outAll();
        AppleMacBookPro16.outAll();
        AcerAspire3.outAll();
        AsusRogStrixG18.outAll();

    }
    
}