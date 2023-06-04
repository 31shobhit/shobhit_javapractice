// perimeter of rectangle
import java.util.*;
public class Peri_rect 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of rectangle : ");
        int length = scan.nextInt();
        System.out.println("Enter breadth of rectangle : ");
        int breadth = scan.nextInt();
        int perimeter = (2 * length) + (2 * breadth); // formula
        System.out.println("Perimeter of rectangle is : " + perimeter);
        scan.close();
        
    }
    
}
