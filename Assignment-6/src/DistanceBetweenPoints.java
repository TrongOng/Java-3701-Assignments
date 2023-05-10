/*(Distance Between Points) 
Write method distance to calculate 
the distance between two point objects 
(x1, y1) and (x2, y2). All numbers and return 
values should be of type double. Incorporate this 
method into an application that enables the user to 
enter the coordinates of the points. */

import java.util.Scanner;
import java.lang.Math;

public class DistanceBetweenPoints {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter First Point X and Y separated by spaces");

        double xCoords1 = input.nextDouble();
        double yCoords1 = input.nextDouble();

        System.out.println("Enter Second Point X and Y separated by spaces");

        double xCoords2 = input.nextDouble();
        double yCoords2 = input.nextDouble();

        double result = distance(xCoords1, yCoords1, xCoords2, yCoords2);

        System.out.println("Distance: " + result);
        
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        double x = x2-x1;
        double y = y2-y1;
        double sqX = x*x;
        double sqY = y*y;

        double z = sqX+sqY;
        double sq = Math.sqrt(z);

        return sq;
    }  
}
