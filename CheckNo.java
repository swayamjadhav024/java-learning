import java.util.Scanner;
public class CheckNo {
    public static void main(String[] args)
    { 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        if(num>0)
        
            if(num%2==0)
           { 
            System.out.print("Number is positive and even");
           }
           else
           {
            System.out.print("Number is positive and odd");
           }
           else if(num<0)
           {
            if(num%2==0)
            {
                System.out.print("number is negative and even");
            }
            else
            {
                System.out.print("number is negative and odd");
            }
            
            
           }
            else
           { 
            System.out.print("Numberis zero");

           }
        
    }
}
