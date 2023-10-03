import java.util.Scanner;
public class ATM_Machine {
    public static void main(String [] arg)
    {
        Scanner sc=new Scanner(System.in);
        long cur_bal=45000;
        int choice=0;
        do{

        
        System.out.println("____Welcome to Naman's ATM Machine____");
        System.out.println("Enter 1 to withdraw Cash.");
        System.out.println("Enter 2 to Deposit Cash.");
        System.out.println("Enter 3 to Know the balanace.");
        System.out.println("Enter 4 to Exit.");
        System.out.println("");
        choice=sc.nextInt();
        int pin_def=112233;
        int withd_bal=0;
        int deposit_bal=0;
        System.out.print("Enter you PIN: ");
        int pin_your=sc.nextInt();
        if (pin_your==pin_def)
        {
        switch(choice)
        {
            case 1:
            {
                System.out.println("Enter the amount to be withdrawn: ");
                withd_bal=sc.nextInt();
                cur_bal-=withd_bal;
                System.out.println("$"+withd_bal+" has been suucesfully withdrwan");
                System.out.println("Current balance is: $"+cur_bal);
                break;
            }
            case 2:
            {
                 System.out.println("Enter the amount to Deposit: ");
                  deposit_bal=sc.nextInt();
                  cur_bal+=deposit_bal;
                System.out.println("$"+deposit_bal+" has been suucesfully Deposit");
                System.out.println("Current balance is: $"+cur_bal);
                break;
            }
            case 3:
            {
                System.out.println("Current balance is: $"+cur_bal);
                break;
            }
            case 4:
            {
                System.out.println("Exit Succesfully!");
                break;
            }
            default:
            {
                System.out.println("Inavlid Input!");
            }
        }
    }
    else{
        System.out.println("Wrong PIN");
    }
}while(choice!=4);
    }
}
