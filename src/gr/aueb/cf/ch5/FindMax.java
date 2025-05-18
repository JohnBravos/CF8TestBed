package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Δίνονται 3 ακέραιοι αριθμοί και
 * επιστρέφει τον μεγαλύτερο.
 */

public class FindMax {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c;
        int result;

        System.out.println("Παρακαλώ δώσε 3 ακέραιους αριθμούς");
        a = getInteger();
        b = getInteger();
        c = getInteger();

        result = findMax(a, b, c);
        printTheResult(a,b,c,result);
    }
    
    public static int getInteger() {
        return scanner.nextInt();
    }

    public static int findMax(int a, int b, int c) {
        int max1;
        int max2;
        max1 = Math.max(a, b);
        max2 = Math.max(max1, c);
        return max2;
    }

   public static void printTheResult(int a, int b, int c, int result) {
        System.out.printf("Ο μεγαλύτερος αριθμός μεταξύ των, %d, %d, %d είναι %d\n", a, b, c, result);
    }
}
