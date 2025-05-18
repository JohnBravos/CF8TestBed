package gr.aueb.cf.ch2;

/**
 * Μετατροπή από Fahrenheit σε Celcius
 * Χρησιμοποιεί τον τύπο: C = 5 * (F - 32) / 9.
 */
import java.util.Scanner;

public class FahrToCelcius {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Please give a Fahrenheit temperature.");
        int fahrenheitTemp = in.nextInt();

        int celciusTemp = 5 * (fahrenheitTemp - 32) / 9;

        System.out.printf("The %d fahrenheit are %d celcius\n", fahrenheitTemp, celciusTemp);
    }
}
