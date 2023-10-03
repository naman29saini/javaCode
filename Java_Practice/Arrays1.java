// import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] arg)
    {
        //First method to make the ARRAYS
        int[] marks=new int[4];
        marks[0]=67;
        marks[1]=98;
        marks[2]=93;
        marks[3]=23;
        System.out.println(marks); //it will print garbage value
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(i+": "+ marks[i]);
        }

        //Another way to make the ARRAYS
        int []marks1={34,78,54};
        for(int i=0;i<marks1.length;i++)
        {
            System.out.println(i+": "+ marks1[i]);
        }


        //Sorting the ARRAYS
        Arrays.sort(marks);
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(i+": "+ marks[i]);
        }

        //2D Arrays
        int[][] TwoStuMarks={{56,78,89},{32,76,43}};
        System.out.println(TwoStuMarks[1][2]);
        System.out.println(TwoStuMarks[0][1]);
    }
}
