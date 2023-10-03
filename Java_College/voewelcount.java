import java.util.Scanner;
public class voewelcount {
    public static void main(String [] arg){
        Scanner sc=new Scanner(System.in);
        int vow_count=0;
        int con_count=0;
        System.out.print("Enter the string: ");
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a'|| str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'|| str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
            {
                vow_count++;
            }
            else{
                con_count++;
            }
        }
        System.out.println("String entered by you is: "+str);
        System.out.println("Length of String: "+str.length());
        System.out.println("Total number of vowels: "+vow_count);
        System.out.println("Total number of consonents: "+con_count);

    }
}
