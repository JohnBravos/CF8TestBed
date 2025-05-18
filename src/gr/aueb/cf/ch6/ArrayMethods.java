package gr.aueb.cf.ch6;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        int[] arr = {4, 6, 7, -3, 4, 3, 2};
        int[] doubled = doubledArray(arr);;
        boolean hasAnypositives = false;
        int position = getPosition(arr, 7);
        boolean allPositive = false;

        printPosition(position);
        printEven(arr);
        System.out.println(Arrays.toString(doubled));
        hasAnypositives = areAnyPositives(arr);
        System.out.println(hasAnypositives);
        allPositive = allPositives(arr);
        System.out.println(allPositive);

    }

    /**
     * Finds the position of a value in the array (1-based index).
     * @param arr The input array
     * @param value The value to search for
     * @return The position (1-based index), or 0 if not found
     */

    public static int getPosition(int[] arr, int value) {
        int position = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                position = i + 1;
            }
        }
        return position;
    }

    public static void printEven(int[] arr) {
        System.out.print("Οι άρτιοι αριθμοί είναι: ");
        for (int el: arr) {
            if (el % 2 == 0) {
                System.out.print(el + " ");
            }
        }
        System.out.println();
    }

    /**
     * Returns a new array with each element doubled.
     * @param arr The input array
     * @return A new array with doubled values, or null if input is null
     */

    public static int[] doubledArray(int[] arr) {
        if (arr == null) return null;

        int[] doubled = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            doubled[i] = arr[i] * 2;
        }
        return doubled;
    }

    public static boolean areAnyPositives(int[] arr) {
        int count = 0;

        for (int el: arr) {
            if (el > 0) count++;
        }
        return count >= 1;
    }

    public static boolean allPositives(int[] arr) {
        int count = 0;

        for (int el: arr) {
            if (el > 0) count++;
        }
            return count == arr.length;
    }

    public static void printArray(int[] arr) {
        for(int el: arr) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    public static void printPosition(int i) {
        System.out.println("Position = " + i);
    }
}
