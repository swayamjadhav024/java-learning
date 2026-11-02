import java.util.Scanner;
public class CheckNumber {
    public static void main(String[] agrs)

    {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter a number :");
        int num=sc.nextInt();

        if(num%2==0)
        { 
            System.out.print("number is even");

        } else
        { 
            System.out.print("number is odd");

        }
        
    }
}
