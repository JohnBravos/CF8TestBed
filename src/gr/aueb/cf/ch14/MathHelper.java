package gr.aueb.cf.ch14;

public class MathHelper {

    private MathHelper() {}

    public static int max(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    public static int min(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int min = arr[0];
        for (int num: arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static double average(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }

}
