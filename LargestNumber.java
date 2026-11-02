import java.util.Scanner;
public class LargestNumber 
{
 public static void main(String[] args)
 { 
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter first number a:");
    int a=sc.nextInt();
    System.out.println("enter second Number b:");
    int b=sc.nextInt();
    System.out.print("Entre third number c:");
    int c=sc.nextInt();
     if(a>b && a>c)
     { 
        System.out.print("Largest no is a");
     }
     else if(b>a && b>c)
     { 
        System.out.print("largest no is b");

     } 
     else 
     {
        System.out.print("Largest number i c");
     }
 }


}
    

