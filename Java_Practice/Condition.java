import java.util.Scanner;
public class Condition {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount of money you have: ");
        float money=sc.nextFloat();
        if(money>20)
        {
            System.out.println("You can buy both PEN & PENCIL");
        }
        else if(  money>0 && money<=10 )
        {
            System.out.println("You can buy ony PENCIL");
        }
        else if( money>10 && money<=20 )
        {
            System.out.println("You can buy ony PEN");
        }
        else{
            System.out.println("You donot have enough Money.");
        }


    }
}
