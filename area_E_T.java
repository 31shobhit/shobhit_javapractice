import java.util.Scanner;
public class area_E_T 
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the value of side");
        double s =scan.nextDouble();
        double area = (1.732* s*s)/4; //formula
        System.out.println("area of Triangle: "+ area );
        scan.close();
    }
    
}

