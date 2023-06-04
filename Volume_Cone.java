// volume of cone
import java.util.*;
public class Volume_Cone 
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = scan.nextDouble();
        System.out.println("Enter height: ");
        double height = scan.nextDouble();
        double volume = (Math.PI *radius*radius*height)/3; // formula
        System.out.println("volume of cone: "+volume);
        scan.close();
    }
    
}
