import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class File_Read {
    public static void main(String [] arg) throws IOException{
        File f1=new File("C:\\Users\\91720\\Desktop\\Naman11.txt");
        Scanner sc=new Scanner(f1);
        while(sc.hasNextLine()){
            String str=sc.nextLine();
            System.out.println(str);
        }
        sc.close();
    }
}
