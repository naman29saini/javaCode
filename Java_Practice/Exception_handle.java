public class Exception_handle {
    public static void main(String [] arg)

    {
        int [] marks={34,56,78};
        try{

            System.out.println(marks[4]);
        }
        catch(Exception exception)
        {
            System.out.println("Exception is handled");
        }
        for(int i=0;i<10;i++)
        {
            System.out.println(i);
        }
    }
}
