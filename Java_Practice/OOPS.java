// import bank;
class Student{
    String name;
    int age;
    //NOTE: there is no the concept of consructor in java,beacuse there is garbage collector in java so destructor is noyt there.
    //default constructor
    Student(){
        System.out.println("Constructor is called");
    }
    //parameterised constructor
    Student(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    //copy constructor
    Student(Student s2)
    {
        this.name=s2.name;
        this.age=s2.age;
    }
    //method
    public void display(){
        System.out.println("Name of student is: "+this.name);
        System.out.println("Age of student is: "+this.age);
    }
    //POLYMORPHISM is ability to create more than one form.
    // two types;
    // RUN TIME POLYMORPHISM =>
    // COMPILE TIME POLYMORPHISM => method/function overloading & method/function overriding

    //function overloading: function overloading is a COMPILE time POLYMORPHISM. It is a also known as method overloading. in this,name of sunctions are same but no of arguments, type of argumenst will be diffeent to differentiate the methods.
    public void display(String name){
        System.out.println("name is: "+this.name);
    }
    public void display(String name, int age)
    {
        System.out.println("name is: "+this.name+" age is: "+this.age);
    }
    public void display(int age)
    {
        System.out.println("age is: "+age);
    }
}
//INHERITAANCE: is a way to use the properties of one class into another class.
//single level inheritance

class Shape{
    public void area()
    {
        System.out.println("displays area");
    }
}
class Triangle extends Shape{
    public void area(int l, int h)
    {
        System.out.println("Area od triangle is: "+(0.5*l*h));
    }
}
//multi level inheritance
class EqiTriangle extends Triangle{
    public void area(int l, int h)
    {
        System.out.println("Area od triangle is: "+(0.5*l*h));
    }
}
//hiearchial level inheritance
class Circle extends Shape{
    public void area(int r)
    {
        System.out.println("Area of circle is: "+(3.14)*r*r);
    }
}

//hybrid level inheritance: combination of single level, multi level and hiearchial inheritance




//ABSTRACTION: is the process of showing essential data to the user
abstract class Animal{
    //constructor chaning
    Animal(){
        System.out.println("Constructor of animal");
    }
    abstract  void eat();
    public void walk()
    {
        System.out.println("one of the animal is walking");
    }
}
class Elephant extends Animal{
    public void eat(){
        System.out.println("Elephant is eating");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("constructor of horse");
    }
    public void eat(){
        System.out.println("Horse is eating");
    }
}
//INTERFACE/multiple inheritance
interface employee{
    //all the variable will be final by default. all the metghods will be abstracted.
    int sal=50000;
    void dis();
}
interface employee2{
    int sal2=34000;
    void dis();
}
class Developer implements employee,employee2{
    public void dis()
    {
        System.out.println("Displaying the developer");
    }
}
//STATIC keyword
class ABC{
    //no need to create the object for the static keyword.
    //static can be written in front of variable,methods,blick or class
    String name;
    static int age;
    public void dis()
    {
        System.out.println(age);
    }
}






public class OOPS {
    public static void main(String [] arg)
{
    Student s1=new Student();
    s1.name="Naman";
    s1.age=20;
    s1.display();
    // s1.display("Saini",56);
    // s1.display("Naman");
    // s1.display(34);

    // Student s2=new Student(s1);
    // s2.display();
    Horse hr=new Horse();
    hr.eat();
    hr.walk();
    //abstract class object can not be created
    // Animal ani=new Animal();
    // ani.walk();
    Developer dev=new Developer();
    dev.dis();
    ABC.age=89;
    ABC abc=new ABC();
    abc.dis();
}
}