import java.util.Scanner;

public class CtoFConverter {
    static void main() {
        // input C and compute F
        Scanner in = new Scanner(System.in);

        double cVal = 0;
        double fVal = 0;
        boolean done = false;
        String trash = "";

        // F = C * 9/5 + 32;

        do {
            IO.print("Enter the C value to convert to F: ");

            if (in.hasNextDouble()) {
                cVal = in.nextDouble();
                in.nextLine(); // Clear the newline from the buffer

                fVal = cVal * 9.0 / 5 + 32;

                IO.println("The Celsius value " + cVal + " is equal to " + fVal + " in Fahrenheit!");
                done = true;
            } else {
                trash = in.nextLine();
                IO.println("You must enter a valid Celsius value, not: " + trash + "\nTry again!");

            }
        } while (!done);

    }
}
