import java.util.Scanner;

public class area_c
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter radius : ");
        int r = scan.nextInt(); // value of radius of a circle
        double pi = 3.14; //value of pi(22/7)
        double area = pi * r * r;
        System.out.println("Area of circle is : " + area);
        scan.close();
    }
    
}