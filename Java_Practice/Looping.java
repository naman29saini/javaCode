import java.util.Scanner;
public class Looping {
    public static void main(String [] arg)
    {
        //For Loop
        System.out.println("For-Loop");
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
        }

        //While Loop
        System.out.println("While-Loop");
        int j=1;
        while(j<=10)
        {
            System.out.println(j);
            j++;
        }

        //DoWhile Loop
        System.out.println("DoWhile-Loop");
        int k=10;
        do{
            System.out.println(k);
            k--;
        }while(k>=1);

        //Excercise
        Scanner sc=new Scanner(System.in);
        int i;
        do{
            System.out.println("Enter the number: ");
            i=sc.nextInt();
            System.out.print("number entered is: ");
            System.out.println(i);
        }while(i>0);
        System.out.println("The END");


    }
}
