// perimeter of circle
import java.util.*;
class Peri_C 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter radius of circle : ");
        double r = scan.nextDouble();
        double perimeter = (2*3.14*r); // Formula
        System.out.println("Perimeter of circle is : " + perimeter);
        scan.close();
    }

}