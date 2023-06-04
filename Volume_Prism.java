// volume of prism
import java.util.*;
public class Volume_Prism
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of Base area");
        int Base = scan.nextInt();
        System.out.println("Enter the value of Height");
        int Height = scan.nextInt();
        int volume = Base*Height; // formula
        System.out.println("volume of prism "+volume);
        scan.close();
    }
    
}
