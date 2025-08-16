package gr.aueb.cf.augustChallenges;

/*
Δίνεται ένας πίνακας και υπολογίζεται η συχνότητα
εμφάνισης των θετικών, αρνητικών και των μηδενικών του πίνακα
με μέθοδο.
 */

public class SixthChallenge {

    public static void main(String[] args) {
        int[] arr = {1, -2, 0, 3, 0, -4};

        findOccurrenceFrequency(arr);
    }

    public static void findOccurrenceFrequency(int[] arr) {
        int positives = 0;
        int negatives = 0;
        int zeroes = 0;
        int total = arr.length;

        for (int j : arr) {
            if (j > 0) {
                positives += 1;
            } else if (j < 0) {
                negatives += 1;
            } else {
                zeroes += 1;
            }
        }

        // Υπολογισμός συχνοτήτων με 6 δεκαδικά ψηφία
        double positivesFreq = (double) positives / total;
        double negativesFreq = (double) negatives / total;
        double zeroesFreq = (double) zeroes / total;

        // Εκτύπωση με 6 δεκαδικά ψηφία
        System.out.printf("Συχνότητα θετικών: %6f, Συχνότητα αρνητικών: %6f, Συχνότητα μηδενικών: %6f", positivesFreq, negativesFreq, zeroesFreq);
    }
}
