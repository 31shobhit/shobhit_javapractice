import java.util.Scanner;

public class fibonnoci 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = scan.nextInt();
        int prev = 0;  //previous number
        int init = 1;  //Initial number
        int count =2;
        while(count<=n)
        {
            int temp=init;
            init+=prev;
            prev = temp;
            count++;
        }
        System.out.println(init);
        scan.close();
    }
}
