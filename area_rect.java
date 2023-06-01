import java.util.Scanner;

public class area_rect 
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("value of length: ");
        double length = scan.nextDouble();
        System.out.println("value of breath");
        double breath = scan.nextDouble();
        double area = length * breath;
        System.out.println("area is: " + area); // area of rectangle
        scan.close();    
    }
    
}
