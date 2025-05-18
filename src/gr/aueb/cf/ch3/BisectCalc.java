package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει ένα έτος (ακέραιο) και
 * το πρόγραμμα υπολογίζει αν είναι δίσεκτο.
 * Δηλαδή αν έχει 366 μέρες ή 365.
 * Δίσεκτο είναι έτος όταν διαιρείται ακριβώς με το 4 ή με το 100
 * αλλά όχι με το 400.
 */

public class BisectCalc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;

        while (true) {
            System.out.println("Please give a year!");
            year = scanner.nextInt();



            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("The year is bisect!");
            } else {
                System.out.println("Not bisect");
            }
        }


    }
}
