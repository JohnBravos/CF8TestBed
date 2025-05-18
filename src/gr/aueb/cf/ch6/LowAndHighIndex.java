package gr.aueb.cf.ch6;

public class LowAndHighIndex {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 4, 4, 4, 5};
        int key = 2;
        int[] result = getLowAndHighIndexOf(arr, key);
        System.out.println("Low index: " + result[0] + ", High index: " + result[1]);

    }

    public static int[] getLowAndHighIndexOf(int[] arr, int key) {
        int[] result = {-1, -1};
        if (arr == null || arr.length == 0) return result;

        // Βρες το low index (πρώτη εμφάνιση του key)
        result[0] = findBound(arr, key, true);
        if (result[0] == -1) return result; // Αν δεν υπάρχει το key

        // Βρες το high index (τελευταία εμφάνιση του key)
        result[1] = findBound(arr, key, false);
        return result;
    }

    /**
     * Βοηθητική μέθοδος για εύρεση του low ή high index.
     * @param isLow αν true, ψάχνει για το low index, αλλιώς για το high.
     */
    private static int findBound(int[] arr, int key, boolean isLow) {
        int left = 0, right = arr.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                index = mid;
                if (isLow) {
                    right = mid - 1; // Ψάξε πιο αριστερά για το low index
                } else {
                    left = mid + 1;  // Ψάξε πιο δεξιά για το high index
                }
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return index;
    }
}
