// perimeter of square
import java.util.*;
public class Peri_Sqaure 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the sides of square: ");
        int a = scan.nextInt();
        double perimeter = 4*a; //formula
        System.out.println("Perimeter of square is: "+ perimeter);
        scan.close();
        
    }
    
}
