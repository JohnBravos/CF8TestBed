package gr.aueb.cf.ch6;

/**
 * Βρίσκει και εκτυπώνει τη θέση του μέγιστου ενός πίνακα.
 */

public class GetMaxPosition {

    public static void main(String[] args) {

        int[] arr = {23, 54, 65, 89};
        int maxPosition = 0;
        maxPosition = findMaxPosition(arr, 0, 3);
        printMaxPosition(maxPosition, arr[maxPosition]);
    }

    public static int findMaxPosition(int[] arr, int low, int high) {
        if (arr == null || low < 0 || high >= arr.length || low > high) {
            throw new IllegalArgumentException("Invalid input parameters");
        }
        int maxPosition = low;
        int maxValue = arr[low];

        for (int i = low + 1; i <= high; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxPosition = i;
            }
        }
        return maxPosition;
    }
    public static void printMaxPosition(int i, int MaxValue) {
        System.out.printf("MaxValue = %d, MaxPosition = %d\n",MaxValue, i + 1);
    }
}
