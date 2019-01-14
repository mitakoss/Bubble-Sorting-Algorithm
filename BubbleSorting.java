/*
Алгоритъм за сортиране по метода
на балончетата. Bubble sort algorithm.
 */

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSorting {
    public static void main(String[] args) {
        getNumbers();
    }

    public static void getNumbers() {
        int[] numbers = new int[5];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Моля, въведете цели 5 числа: ");
            numbers[i] = input.nextInt();
        }
        System.out.println("Въведените от вас числa са: ");

        print(numbers);
        bubleSorting(numbers);
    }

    public static void bubleSorting(int[] array) {
        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Сортираният масив е: ");
        print(array);
    }

    public static void print(int[] array){
        System.out.println(Arrays.toString(array));
    }
}