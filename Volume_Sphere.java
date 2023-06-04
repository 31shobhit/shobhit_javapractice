//volume of sphere
import java.util.*;
public class Volume_Sphere 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of the sphere: ");
        double r = scan.nextDouble();
        double volume = (4.0/3.0)*Math.PI*r*r*r; // formula
        System.out.println("The volume of the sphere is: " + volume);
        scan.close();
    }
}
