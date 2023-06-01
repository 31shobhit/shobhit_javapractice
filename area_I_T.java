import java.util.Scanner;

public class area_I_T 
{
    public static void main(String[] args) 
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the value of height"); 
        double height = scan.nextDouble(); 
        System.out.println("Enter the value of base");
        double base = scan.nextDouble();
        double area = (height*base)/2; // formula of area of Isosceles triangle
        System.out.println("Area of trianle: " +area);
    }
}
