import java.util.Scanner;

public class Taking {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=sc.nextInt();
        System.out.println("Enter your name: ");
        String name=sc.next();
        System.out.println("Describe something about yourself.");
        String desp=sc.nextLine();
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Desciption: "+desp);
    }
}
