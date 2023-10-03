// package banking;
class Account{
    public String name;
    public void display(){
        System.out.println("Display "+name+" "+age);
    }
    private String password;
    protected int age;
    public String getPass(){
        return this.password;
    }
    public void setPass(String password)
    {
        this.password=password;
    }
}
public class Bank1{
    public static void main(String [] arg){
        Account ac=new Account();
        ac.name="naman";
        ac.age=34;
        ac.display();
        ac.setPass("abc");
        System.out.println(ac.getPass());
    }
}