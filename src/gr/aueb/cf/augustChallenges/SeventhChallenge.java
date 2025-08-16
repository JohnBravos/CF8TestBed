package gr.aueb.cf.augustChallenges;

/*
    Αθροίζει τα ν - 1 μικρότερα στοιχεία και τα
    ν - 1 μεγαλύτερα στοιχεία ενός πίνακα εκτός από ένα.
 */

import java.util.Arrays;

public class SeventhChallenge {

    public static void main(String[] args) {
//        int[] arr = {1, 3, 5, 7, 9};
        int[] arr = {1, 1, 1, 1, 1};


        findMaxAndMinSum(arr);
    }

    public static void findMaxAndMinSum(int[] arr) {
//        int totalSum = 0;
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//
//        for (int num : arr) {
//           totalSum += num;
//           if (num > max) max = num;
//           if (num < min) min = num;
//        }
//
//        long maxSum = totalSum - max;
//        long minSum = totalSum - min;
//        System.out.println("minSum = " + minSum + " " + "maxSum = " + maxSum);

        long minSum = Arrays.stream(arr).sorted().limit(4).sum();
        long maxSum = Arrays.stream(arr).sorted().skip(1).sum();
        System.out.println("minSum = " + minSum + " " + "maxSum = " + maxSum);
    }
}
