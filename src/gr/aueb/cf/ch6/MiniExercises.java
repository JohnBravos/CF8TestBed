package gr.aueb.cf.ch6;

import java.util.Scanner;

public class MiniExercises {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 6;

        int[] array = new int[size];
        System.out.println("Please give " + size + " elements");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            while (array[i] < 1 || array[i] > 49) {
                System.out.println("Μη έγκυρος αριθμός. Εισάγετε ξανά (1-49):");
                array[i] = scanner.nextInt();
            }
        }

        scanner.close();

        System.out.println(countEvenNumbers(array));
        System.out.println(countOddNumbers(array));
        System.out.println(moreThanThreeConsecutive(array));
        System.out.println(hasMoreThanThreeNumbersWithSameEnding(array));
        System.out.println(hasMoreThanThreeInSameDecade(array));
    }


    public static boolean countEvenNumbers(int[] arr) {
        int count = 0;
        System.out.print("Δεν έχει πάνω από 3 άρτιους: ");
        for (int el: arr) {
            if (el % 2 == 0)
                count++;
        }
        return count >= 1 && count <= 3;
    }

    public static boolean countOddNumbers(int[] arr) {
        int count = 0;
        System.out.print("Δεν έχει πάνω από 3 περιττούς: ");
        for (int el: arr) {
            if (el % 2 != 0)
                count++;
        }
        return count >= 1 && count <= 3;
    }

    public static boolean moreThanThreeConsecutive(int[] arr) {
        int count = 0;
        System.out.print("Are there 3 consecutive numbers: ");
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == arr[i + 1] - 1 && arr[i] == arr[i + 2] - 2)
                count++;
        }
        return count == 1;
    }

    public static boolean hasMoreThanThreeNumbersWithSameEnding(int[] arr) {
        if (arr == null) return false;

        System.out.print("Are more than 3 numbers with same ending: ");

        int[] endings = new int[10];
        for (int el : arr) {
            if (++endings[el % 10] >= 3)
                return true;
        }
        return false;
    }

    public static boolean hasMoreThanThreeInSameDecade(int[] arr) {
        int[] decades = new int[5];

        for (int num : arr) {
            decades[(num - 1) / 10]++;
            if (decades[(num - 1) / 10] >= 3) {
                return true;
            }
        }
        return false;
    }
}
