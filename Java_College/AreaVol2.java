import java.util.Scanner;
abstract class Area1{
    abstract void area_cub(float l, float b, float h);
    abstract void vol_cub(float l, float b, float h);
}
class Result extends Area1{
      void area_cub(float l, float b, float h)
    {
        System.out.println("Area of Cuboid is: "+(2*((l*b)+(b*h)+(h*l))));
    }
     void vol_cub(float l, float b, float h)
    {
        System.out.println("Volume of cuboid is: "+(l*b*h));
    }
}
class AreaVol2 {
   
    public static void main(String [] arg){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of Cuboid: ");
        float l=sc.nextFloat();
        System.out.print("Enter the breadth of Cuboid: ");
        float b=sc.nextFloat();
        System.out.print("Enter the heigth of Cuboid: ");
        float h=sc.nextFloat();
       Result r1=new Result();
        r1.area_cub(l, b, h);
        r1.vol_cub(l, b, h);
    }
}
