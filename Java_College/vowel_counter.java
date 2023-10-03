import java.util.Scanner;

public class vowel_counter {
    public static void main(String [] arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String a=sc.nextLine();
        int count=0;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u')
            {
                count++;
            }
        }
        System.out.println("Number of vowel in --"+a+"-- is: "+count);
    }
}
