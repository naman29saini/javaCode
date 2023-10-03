public class addmul1 {
    public static void main(String [] arg)
    {
        int a[][]={{1,2,1},{2,6,1},{3,2,8}};
        int b[][]={{3,10,19},{7,2,3},{6,1,5}};
        int c[][]=new int[3][3];
        int d[][]=new int[3][3];
        System.out.println("Sum of matrix A and matrix B:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Multiplication of matrix A and matrix B:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                d[i][j]=0;
                for(int k=0;k<3;k++)
                {
                    d[i][j]+=a[i][k]*b[k][j];
                }
                System.out.print(d[i][j]+" ");
            }
            System.out.println();
        }
    }
}
