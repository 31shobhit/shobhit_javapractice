import java.util.Scanner;

public class area_Cylin
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius ");
        int r = scan.nextInt();
        System.out.println("Enter the height");
        int h = scan.nextInt();
        double area = (2*3.14*r*h) + (2*3.14*r*r); // formula
        System.out.println("The area of cylinder is: " + area);
        scan.close();
        
    }

}