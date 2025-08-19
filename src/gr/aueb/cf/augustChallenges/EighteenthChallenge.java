package gr.aueb.cf.augustChallenges;

/*
    Αντικαθιστά τα κενά ενός String με "%20"
 */

public class EighteenthChallenge {

    public static void main(String[] args) {
        String s = "Athens Uni of Econ and Business";

        System.out.println(urlEncoding(s));
    }

    public static String urlEncoding(String s) {
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                sb.append("%20");
            } else sb.append(ch);
        }
        return sb.toString();
    }
}
