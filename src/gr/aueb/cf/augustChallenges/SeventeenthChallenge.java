package gr.aueb.cf.augustChallenges;

/*
    Ελέγχει άν ένα String είναι παλινδρομικό, δηλαδή
    διαβάζεται το ίδιο από την αρχή και το τέλος
 */

public class SeventeenthChallenge {

    public static void main(String[] args) {
        String s = "daddy";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);

        return sb.reverse().toString().equals(s);
    }
}
