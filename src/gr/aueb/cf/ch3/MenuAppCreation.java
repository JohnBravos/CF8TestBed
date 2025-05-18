package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εμφανίστε επαναληπτικά ένα μενού με τις παρακάτω
 * επιλογές, το οποίο να επαναλαμβάνεται μέχρι ο χρήστης να
 * δώσει τον αριθμό 5. Για κάθε επιλογή από 1 – 4 θα πρέπει
 * να εμφανίζεται feedback, για παράδειγμα αν ο χρήστης
 * δώσει 1, θα εμφανίζεται το μήνυμα  “Επιλέξατε Εισαγωγή».
 * Θα πρέπει επίσης να ελέγχετε αν ο χρήστης δώσει αριθμό
 * < 0 ή > 5 και να δίνετε κατάλληλο μήνυμα.
 */

public class MenuAppCreation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputChoice = 0;

        do {
            System.out.println("Please select one of the following");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");

            inputChoice = scanner.nextInt();

            if (inputChoice == 1){
                System.out.println("Εισαγωγή");
            }
            else if(inputChoice == 2) {
                System.out.println("Διαγραφή");
            }
            else if (inputChoice == 3) {
                System.out.println("Ενημέρωση");
            }
            else if (inputChoice == 4) {
                System.out.println("Αναζήτηση");
            } else if (inputChoice == 5){
                System.out.println("Έξοδος");
                }
            else {
                System.out.println("Λάθος επιλογή");
            }
        } while(inputChoice != 5);

        System.out.println("goodbye");
    }
}
