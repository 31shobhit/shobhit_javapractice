// volume of Pyramid
import java.util.*;
public class Volume_Pyramid 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of length");
        int length=sc.nextInt();
        System.out.println("enter value of width");
        int width=sc.nextInt();
        System.out.println("enter value of height");
        int height=sc.nextInt();
        double volume =(length*width*height)/3; // formula
        System.out.println("volume of pyramid is "+volume);
        sc.close();
    }
}
