import java.util.Scanner;
public class Factorial_5 {
    public static void main(String [] arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Factorial Number->");
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        long fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of "+num+" is: "+fact);
    }
}
