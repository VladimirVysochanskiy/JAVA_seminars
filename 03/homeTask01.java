import java.util.Arrays;

/**
 Реализовать алгоритм сортировки слиянием и выборкой.(Самое эффективное , 
 это изучить эти сортировки на Питоне , и постараться написать их на java)

    
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

    static void mergeSort(int[] nums) {
        if (nums.length > 1) {
            int mid = nums.length / 2;
            int[] left = Arrays.copyOfRange(nums, 0, mid);
            int[] right = Arrays.copyOfRange(nums, mid, nums.length);
            mergeSort(left);
            mergeSort(right);
            int i = 0;
            int j = 0;
            int k = 0;
            while (i < left.length & j < right.length) {
                if (left[i] < right[j]) {
                    nums[k] = left[i];
                    i++;
                }
                else {
                    nums[k] = right[j];
                    j++;
                }
                k++;
            }
            while (i < left.length) {
                nums[k] = left[i];
                i++;
                k++;
            }
            while (j < right.length) {
                nums[k] = right[j];
                j++;
                k++;
            }
        }
    }

    public static void main(String[] args) {
        int[] numArray = {10, 3, 5, 4, 9, 10, 8, 2, 1, 7, 6};
        int[] numArray1 = {10, 3, 5, 4, 9, 10, 8, 2, 1, 7, 6};
        System.out.println(Arrays.toString(numArray));
        insertionSort(numArray);
        System.out.println(Arrays.toString(numArray));
        mergeSort(numArray1);
        System.out.println(Arrays.toString(numArray1));
    }
}