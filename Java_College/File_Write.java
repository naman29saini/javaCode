import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class File_Write {
    public static void main(String [] arg) throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String text=sc.nextLine();
        FileWriter f1=new FileWriter("C:\\Users\\91720\\Desktop\\Naman12.txt");
        f1.write(text);
        f1.close();
        System.out.println("File Created successfully");

    }
}
