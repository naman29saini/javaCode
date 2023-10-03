public class DataTypes {
    public static void main(String arg[])
    {
        //Primitive DataTypes
        byte a=30;                      //1 Bytes
        short mobNo3=234;               //2 Bytes
        int monNo=1234567890;           //4 Bytes
        long monNo2=123456789000L;      //8 Bytes
        float pi=3.14F;                 //4 Bytes
        double pi2=3.145678D;           //8 Bytes
        char name='a';                  //2 Bytes
        boolean isValid=true;           //1 Bytes
        System.out.println(a+" "+isValid+" "+mobNo3+" "+monNo+" "+monNo2+" "+pi+" "+name+" "+pi2);

         //Non-Primitive DataTypes
        String name1="Naman";
        String name2=new String("Saini");    //Making of String with new keyword.
        System.out.println(name1+" "+name2);
        System.out.println(name1.length());

        int[] arr=new int[3];                         //Making of Array with new keyword.
        arr[0]=23;
        arr[1]=45;
        arr[2]=67;
        System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
        }
}
