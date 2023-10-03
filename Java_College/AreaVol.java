import java.util.Scanner;
interface Area1{
  double area_cub(double l, double b, double h);
    double vol_cub(double l, double b, double h);
}
class Result implements Area1{
    public double area_cub(double l, double b, double h)
      {
        return (2*((l*b)+(b*h)+(h*l)));
        // System.out.println("Area of Cuboid is: "+(2*((l*b)+(b*h)+(h*l))));
    }
    public double vol_cub(double l, double b, double h)
    {
        return (l*b*h);
        // System.out.println("Volume of cuboid is: "+(l*b*h));
    }
}
public class AreaVol {
    public static void main(String [] arg){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of Cuboid: ");
        double l=sc.nextDouble();
        System.out.print("Enter the breadth of Cuboid: ");
        double b=sc.nextDouble();
        System.out.print("Enter the heigth of Cuboid: ");
        double h=sc.nextDouble();
       Result r1=new Result();
        // r1.area_cub(l, b, h);
        // r1.vol_cub(l, b, h);
          System.out.println("Area of Cuboid is: "+r1.area_cub(l, b, h)+" m2");
         System.out.println("Volume of cuboid is: "+ r1.vol_cub(l, b, h)+" m3");
    }
}
