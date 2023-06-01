import java.util.Scanner;

public class DistanceCalculator
 {
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coordinates of the first point:");
        System.out.print("X1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Y1: ");
        double y1 = scanner.nextDouble();

        System.out.println("Enter the coordinates of the second point:");
        System.out.print("X2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Y2: ");
        double y2 = scanner.nextDouble();

        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("The distance between the two points is: " + distance);
        scanner.close();
    }

    public static double calculateDistance(double x1, double y1, double x2, double y2) 
    {
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;

        // Use the distance formula: sqrt((x2 - x1)^2 + (y2 - y1)^2)
        double distance = Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));

        return distance;
    }
}
