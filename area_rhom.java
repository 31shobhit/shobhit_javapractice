import java.util.Scanner;

public class area_rhom 
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of diagnol 1");
        int d1 = scan.nextInt();
        System.out.println("Enter the value of diagnol 2");
        int d2 = scan.nextInt();
        double area = (d1*d2)/2; // formula
        System.out.println("area of Rhombus: "+ area);
        scan.close();
    }
    
}
