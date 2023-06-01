import java.util.Scanner;
class newswitch
{
    public static void main(String[] args) 
    {
        System.out.println("enter the fruit name");
        Scanner scan = new Scanner(System.in);
        String fruit = scan.next(); 
        switch(fruit)
        {
            case "apple" ->System.out.println("is a sweet red fruit");
            case "mango" ->System.out.println("king of fruits");
            case "orange" ->System.out.println("is a round orange fruit");
            case "grapes" -> System.out.println("is used to make kismis");
            default ->System.out.println("not a fruit");
        }
        scan.close();
    }
}
    

