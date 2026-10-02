import java.util.Scanner;

public class FuelCosts {
    static void main() {
        // input C and compute F
        Scanner in = new Scanner(System.in);

        double mpg = 0;
        double capacity = 0;
        double costPerGallon = 0;
        double cost100 = 0;
        double totalMiles = 0;
        boolean done = false;
        String trash = "";

        // Get the MPG
        do {
            IO.print("Enter the fuel efficiency in miles per gallon: ");

            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                in.nextLine();

                done = true;
            } else {
                trash = in.nextLine();
                IO.println("You must enter a valid miles per gallon, not: " + trash + "\nTry again!");
            }
        } while (!done);

        // Get the tank capacity
        done = false;

        do {
            IO.print("Enter the tank capacity in gallons: ");

            if (in.hasNextDouble()) {
                capacity = in.nextDouble();
                in.nextLine();

                done = true;
            } else {
                trash = in.nextLine();
                IO.println("You must enter a valid tank capacity, not " + trash + "\nTry again!");
            }
        } while (!done);

        // Get the Price per gallon
        done = false;

        do {
            IO.print("Enter the price per gallon: ");

            if (in.hasNextDouble()) {
                costPerGallon = in.nextDouble();
                in.nextLine();

                done = true;
            } else {
                trash = in.nextLine();
                IO.println("You must enter a valid price per gallon, not " + trash);
            }
        } while (!done);

        IO.println("The price per gallon is " + costPerGallon);

        // Given size of tank, cost per gallon, and miles per gallon
        // Cost to go 100 miles
        // 100 / mpg * price per gallon
        cost100 = 100 / mpg * costPerGallon;
        totalMiles = capacity * mpg;

        IO.println("The cost to go 100 miles is " + cost100);
        IO.println("The total miles on a full tank is " + totalMiles);
    }
}
