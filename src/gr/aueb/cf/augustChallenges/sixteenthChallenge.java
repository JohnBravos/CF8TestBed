package gr.aueb.cf.augustChallenges;

/*
    Τυπώνει τον χαρακτήρα που εμφανίζεται πιο συχνά
    σε ένα String.
 */

import java.util.Arrays;

public class sixteenthChallenge {

    public static void main(String[] args) {
        String s = "abracadabra";

        System.out.println(highestFrequency(s));
    }

    public static char highestFrequency(String s) {
        int[] frequency = new int[128];

        s.chars().forEach(ch -> frequency[ch]++);
        int max = Arrays.stream(frequency).max().getAsInt();

        return (char) s.chars()
                .filter(ch -> frequency[ch] == max)
                .findFirst()
                .orElseThrow();
    }
}
