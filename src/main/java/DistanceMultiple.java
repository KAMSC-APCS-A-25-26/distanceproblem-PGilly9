/*
 * TODO: APCS-A Distance Program
 *
 * Write a program that:
 *  1. Asks the user how many inputs (pairs of points) they want to enter.
 *  2. For each input, prompt them to enter two points in the format:
 *         (x1,y1)(x2,y2)
 *     Example: (2,3)(7,3)
 *
 *  3. Use Scanner with a custom delimiter:
 *     This should ignore parentheses, commas, and spaces so only numbers remain.
 *
 *  4. Extract x1, y1, x2, y2 as doubles.
 *
 *  5. Compute the distance between the two points:
 *
 *  6. Print the results
 * 
 *  7. Repeat until all inputs have been processed.
 *
 * Example Inputs:
 *  How many inputs? 3
 *  Enter input 1 (like (x1,y1)(x2,y2)): (2,3)(7,3)
 *  Enter input 2 (like (x1,y1)(x2,y2)): (4,5)(8,8)
 *  Enter input 3 (like (x1,y1)(x2,y2)): (-1,-2)(0,7)
 *
 */
// NAME                 :   Parker Gilliland
// GROUP                :   APCS-A
// PROBLEM ID           :   Java Software Solutions, Programming Projects, 2.8
// PROBLEM DESCRIPTION  :   Asks the user to enter two coordinate point,
//                          then it calculates the distance between the points
// SOURCES I USED       :   IntelliJ, Java Software Solutions 3rd edition
// PEOPLE I HELPED      :   Jacob Stasienko
// PEOPLE WHO HELPED ME :   Mr. Houtrouw, Jacob Stasienko

import java.util.Scanner;
import java.lang.Math;

public class DistanceMultiple
{
    //-----------------------------------------------------------------
    //  Distance of coordinate pairs
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        // Scan in numbers
        Scanner scan = new Scanner(System.in).useDelimiter("[(),\\s]+");

        System.out.println("Parker Gilliland\nAPCS-A\nAP Java Software Solutions 2.8\n");

        System.out.print("\nHow many runs would you like to do:  ");
        int runs = scan.nextInt();


        // Insert coordinate points
        for(int i = 0; i < runs; i++)
        {
            System.out.print("\nPlease insert 2 coordinate pairs:  ");
            double x1 = scan.nextDouble();
            double y1 = scan.nextDouble();
            double x2 = scan.nextDouble();
            double y2 = scan.nextDouble();

            // Distances
            double x3 = (x2-x1);
            double y3 = (y2-y1);

            // Powers
            double x4 = Math.pow(x3, 2);
            double y4 = Math.pow(y3, 2);

            double distance = Math.sqrt(x4+y4);
            System.out.println("The Distance is " + distance);
        }
    }
}
/*
C:\Users\parke\.jdks\openjdk-24.0.2+12-54\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.2.1\lib\idea_rt.jar=63123" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\parke\OneDrive\Desktop\Programs\GillilandParkerProject2.8\out\production\GillilandParkerProject2.8 GillilandParkerProject28
Parker Gilliland
APCS-A
AP Java Software Solutions 2.8




How many runs would you like to do:  3




Please insert 2 coordinate pairs:  (2,3) (7,3)
The Distance is 5.0




Please insert 2 coordinate pairs:  (4,5) (8,8)
The Distance is 5.0




Please insert 2 coordinate pairs:  (-1,-2) (0,7)
The Distance is 9.055385138137417




Process finished with exit code 0
*/




