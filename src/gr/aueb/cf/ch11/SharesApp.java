package gr.aueb.cf.ch11;

/**
 * Calculate how many times a share goes below base, where
 * base is 0. For example in the array first goes up 1 drops -1 (0)
 * then -1 ...
 */

public class SharesApp {

    public static void main(String[] args) {
        int[] shares = {1, -1, -1, -1, 1, 1, 1, 1, -1, -1};
        int times = getSharesGoDown(shares);

        System.out.println("Times shares below base" + times);

    }

    /**
     *
     * @param shares the array with shares shifts up and down
     * @return how many times goes below base
     */

    public static int getSharesGoDown(int[] shares) {
        int previousValue;
        int currentValue = 0;
        int count = 0;

        for (int i = 0; i < shares.length; i++) {
            previousValue = currentValue;
            currentValue += shares[i];

            if (currentValue < 0 && previousValue >= 0) count++;
        }

        return count;
    }
}
