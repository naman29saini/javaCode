class Student_obj{
    String name;
    int age;
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class new1 {
   public static void main (String []args){
        Student_obj s1=new Student_obj();
        s1.name="naman";
        s1.age=19;
        s1.printinfo();
    } 
}




