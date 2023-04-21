import java.util.Arrays;

/**
 Реализовать алгоритм сортировки слиянием и выборкой.(Самое эффективное , 
 это изучить эти сортировки на Питоне , и постараться написать их на java)

def insertion_sort(nums):
    # Сортировку начинаем со второго элемента, т.к. считается, что первый элемент уже отсортирован
    for i in range(1, len(nums)):
        item_to_insert = nums[i]
        # Сохраняем ссылку на индекс предыдущего элемента
        j = i - 1
        # Элементы отсортированного сегмента перемещаем вперёд, если они больше
        # элемента для вставки
        while j >= 0 and nums[j] > item_to_insert:
            nums[j + 1] = nums[j]
            j -= 1
        # Вставляем элемент
        nums[j + 1] = item_to_insert

# Проверяем, что оно работает
random_list_of_nums = [9, 1, 15, 28, 6]
insertion_sort(random_list_of_nums)
print(random_list_of_nums)
 */
public class homeTask01 {

    static void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int itemsToInsert = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > itemsToInsert) {
                nums[j + 1] = nums[j];
                j -= 1;
            nums[j + 1] = itemsToInsert;
            }
        }
    }

    public static void main(String[] args) {
        int[] numArray = {5, 6, 9, 3, 2, 6, 9, 8, 2, 6, 1, 25, 2, 369};
        System.out.println(Arrays.toString(numArray));
        int nnn = 569;
        System.out.println(nnn);
        insertionSort(numArray);
        System.out.println(Arrays.toString(numArray));
    }
}