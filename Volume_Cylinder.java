 // volume of cylinder
 import java.util.*;
 public class Volume_Cylinder
 {
    public static void main(String a[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter radius of cylinder : ");
        double r = scan.nextDouble();
        System.out.print("Enter height of cylinder : ");
        double h = scan.nextDouble();
        double vol = (Math.PI * r * r * h) / 3; // formula
        System.out.println("Volume of cylinder is : " + vol);
        scan.close();
    }

 }