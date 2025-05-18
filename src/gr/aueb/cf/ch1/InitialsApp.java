package gr.aueb.cf.ch1;

/**Θα εκτυπώνει τα αρχικά του ονόματος μου
 * με αστεράκια
 */
public class InitialsApp {
    public static void main(String[] args) {

        String letterN =
                        "*********\n" +
                        "*       *\n" +
                        "*       *\n" +
                        "*********\n" +
                        "*       *\n" +
                        "*       *\n" +
                        "*********\n";

        String letterA =
                        "      *\n" +
                        "     * *\n" +
                        "    *   *\n" +
                        "   *     *\n" +
                        "  *********\n" +
                        " *         *\n" +
                        "*           *\n";
        System.out.println(letterN + letterA);
    }
}
