import java.util.Scanner;

class AException extends Exception{
    AException(String str)
    {
        super(str);
    }
}

public class Exception_Handle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        try{
            if(age>=18)
            {
                System.out.println("Welcome,you can vote");
            }
            else{
                throw new AException("You cannot Vote.");
            }
        }
        catch(AException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
