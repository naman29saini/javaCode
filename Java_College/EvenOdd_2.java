public class EvenOdd_2 {
    public static void OddEven(int a)
    {
        if(a%2==0)
        {
            System.out.println(a+": Even NUmber");
        }
        else{
            System.out.println(a+": Odd Number");
        }
    }
    public static void  main(String [] eo)
    {
        OddEven(2);
        OddEven(5);
        OddEven(7);
        OddEven(11);
        OddEven(16);
    } 
}
