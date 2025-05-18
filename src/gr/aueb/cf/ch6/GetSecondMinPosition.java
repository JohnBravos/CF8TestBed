package gr.aueb.cf.ch6;

public class GetSecondMinPosition {
    public static void main(String[] args) {
        int[] numbers = {23, 54, 65, 89}; // Example array

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : numbers) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        if (secondSmallest != Integer.MAX_VALUE) {
            System.out.println("Second smallest: " + secondSmallest);
        } else {
            System.out.println("No second smallest number found");
        }
    }
}
