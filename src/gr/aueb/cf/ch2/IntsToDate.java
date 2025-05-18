package gr.aueb.cf.ch2;

/**
 * Δημιουργεί μια ημερομηνία από τρεις ακέραιους αριθμούς (μέρα, μήνας, έτος)
 * και την εμφανίζει σε μορφή ΗΗ/ΜΜ/ΕΕ.
 * Π.χ. αν δώσουμε 5 12 2022 θα εμφανίσει
 * 05/12/22
 */

import java.util.Scanner;

public class IntsToDate {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Παρακαλώ δώστε 3 ακέραιους αριθμούς");

        System.out.println("Δώστε ημέρα:");
        int day = in.nextInt();
        System.out.println("Δώστε μήνα:");
        int month = in.nextInt();
        System.out.println("Δώστε έτος:");
        int year = in.nextInt() % 100;

        System.out.printf("H ημερομηνία είναι: %02d/%02d/%02d\n", day, month, year);
    }
}
