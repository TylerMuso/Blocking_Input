import java.util.Scanner;

public class RectangleInfo {
    static void main()
    {
        Scanner in = new Scanner(System.in);

        double height = 0;
        double width = 0;
        double area = 0;
        double perimeter = 0;
        double hypotenuse = 0;
        boolean done = false;
        String trash = "";

        do{
            IO.print("Enter the height: ");

            if(in.hasNextDouble())
            {
                height = in.nextDouble();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                IO.println("You must enter a valid height value, not: " + trash + "\nTry again!");
            }
        }while(!done);

        IO.println("You said the height is " + height);

        done = false;

        do{
            IO.print("Enter the width: ");

            if(in.hasNextDouble())
            {
                width = in.nextDouble();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                IO.println("You must enter a valid width value, not: " + trash + "\nTry again!");
            }
        }while(!done);

        IO.println("You said the width is " + width);

        area = height * width;
        perimeter = 2 * height + 2 * width;
        hypotenuse = Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));

        IO.println("The area is " + area);
        IO.println("The perimeter is " + perimeter);
        IO.println("The hypotenuse is " + hypotenuse);
    }

}
