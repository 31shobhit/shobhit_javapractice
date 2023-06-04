// perimeter of rhombus
import java.util.*;

public class Peri_rhom 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of sides ");
        int a = (int) scan.nextDouble(); // explicit type casting
        double perimeter = 4*a; // formula
        System.out.println("perimeter of rhombus: "+ perimeter);
        scan.close();
    }
    
}
