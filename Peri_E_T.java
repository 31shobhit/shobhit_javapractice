// perimeter if equilateral triangle
import java.util.Scanner;
public  class Peri_E_T
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the side : "); 
        int a = scan.nextInt();
        int perimeter = 3*a;
        System.out.println("perimeter if equilateral triangle: "+perimeter);
        scan.close();
    }
    
}
