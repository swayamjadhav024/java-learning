import java.util.Scanner;
public class Vote 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Age of teh Parson");
        int age=sc.nextInt();
        if(age>18)
        { 
            System.out.print("eligibal for vote");
        }
        else if(age<18)
        { 
            System.out.print("not Eligibal for vote");
        }
        else if(age<0)
        {  
            System.out.print("invalid age");
        

     
            
        }
    }
    
}
// My first GitHub update