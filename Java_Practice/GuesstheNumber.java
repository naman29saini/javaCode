import java.util.Scanner;

public class GuesstheNumber {
    public static void main(String [] arg)
    {
        int ran=(int)(Math.random()*100);
        Scanner sc=new Scanner(System.in);
        int guesnum;
        int count=1;
        do
        {
            System.out.println("Guess the number(1-100): ");
            guesnum=sc.nextInt();
        
        if(guesnum==ran)
        {
            System.out.println("Congratulations, you have entered the correct number!");
        }
        else if(guesnum>ran)
        {
            System.out.println("The number is too large");
        }
        else{
            System.out.println("The number is too small");
        }
        count++;
    }while(guesnum!=ran);

    System.out.println("Number was: "+ran);
    System.out.println("Attempt Taken: " +count);
    }
}
