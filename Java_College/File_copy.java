import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class File_copy {
    public static void main(String[] args) throws IOException{
        File f1=new File("C:\\Users\\91720\\Desktop\\Naman11.txt");
        Scanner sc=new Scanner(f1);
        FileWriter f2=new FileWriter("C:\\Users\\91720\\Desktop\\Naman12.txt");
        while(sc.hasNextLine()){
            String str=sc.nextLine();
            f2.write(str);
        }
        sc.close();
        f2.close();
    }
}
