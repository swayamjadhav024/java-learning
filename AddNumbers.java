import java.util.Scanner;
 
public class AddNumbers
{ 
    public static void main(String[] args)
    { 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first no:");
        int first =sc.nextInt();
        System.out.print("Enter second no");
        int second=sc.nextInt();
        int sum=first+second;
        System.out.println("Sum =" +sum); 
        
    }
}
