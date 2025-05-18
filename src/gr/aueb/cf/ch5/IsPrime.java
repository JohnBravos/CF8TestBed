package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Δίνεται ένας ακέραιος αριθμός και επιστρέφει true
 * αν είναι πρώτος. Πρώτος, είναι ένας αριθμός ο οποίος διαιρείται
 * μόνο με τον εαυτό του και το 1.
 */

public class IsPrime {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        boolean result;
        n = getNumberN();

        result = isPrime(n);
        printAnswer(n);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int getNumberN() {
        System.out.println("Παρακαλώ δώσε έναν ακέραιο αριθμό");
        return scanner.nextInt();
    }

    public static void printAnswer(int n) {
        if (isPrime(n)) System.out.println("Είναι πρώτος");
        else System.out.println("Είναι σύνθετος");
    }
}
