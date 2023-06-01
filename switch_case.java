import java.util.Scanner;
class switch_case
{
    public static void main(String[] args) 
    {
        System.out.println("enter the fruit name");
        Scanner scan = new Scanner(System.in);
        String fruit = scan.next(); 
        switch(fruit)
        {
            case "apple":
                System.out.println("is a sweet red fruit");
                    break;
            case "mango":
                System.out.println("king of fruits");
                    break;
            case "orange":
                System.out.println("is a round orange fruit");
                    break;
            case "grapes":
                System.out.println("is used to make kismis");
                    break;
            default:
                System.out.println("not a fruit");
        }
        scan.close();
    }
}