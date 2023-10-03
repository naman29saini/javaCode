public class Operators {
    public static void main(String [] arg)
    {
        int a=5;
        int b=2;
        //Arithmetic Operators
        System.out.println("Value of a: "+a);
        System.out.println("Value of b: "+b);
        System.out.println("Sum of a and b is: "+ (a+b));
        System.out.println("Subtraction of a and b is: "+ (a-b));
        System.out.println("Multiplication of a and b is: "+ (a*b));
        System.out.println("Division of a and b is: "+ (a/b));
        System.out.println("Modulo of a and b is: "+ (a%b));

        //Unary Operators
        //Post-Increment Operators
        int c=3;
        System.out.println(c++); //3
        System.out.println(c); //4

        //Pre-Increment Operators
        int d=4;
        System.out.println(++d); //5
        System.out.println(d); //5

        //Post-Increment Operators
        int e=5;
        System.out.println(e--); //5
        System.out.println(e); //4
        
        //Pre-Increment Operators
        int f=7;
        System.out.println(--f); //6
        System.out.println(f); //6

        //Comparison Operator
        int a1=8;
        int b1=6;
        System.out.println("a1==b1" +(a1==b1)); //F
        System.out.println("a1>=b1" +(a1>=b1)); //T
        System.out.println("a1<=b1" +(a1<=b1)); //F
        System.out.println("a1!=b1" +(a1!=b1)); //T
        System.out.println("a1>b1" +(a1>b1));  //T
        System.out.println("a1<b1" +(a1<b1));  //F


        //Logical Operator
        
        //logical AND
        if(a1<=10 && b1<=10)
        {
            System.out.println("Both are less than 10");
        }
        else{
            System.out.println("Invalid Output");
        }
        //logical OR
        if(a1<=10 || b1<=10)
        {
            System.out.println("Atleast one is less than 10");
        }
        else{
            System.out.println("Invalid Output");
        }

        //logical NOT
        boolean isAdu=false;
        if(!isAdu)
        {
            System.out.println("is adult");
        }
        else{
            System.out.println("Not adult");
        }

    }
}
