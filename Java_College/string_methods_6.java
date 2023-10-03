public class string_methods_6 {
    public static void main(String [] arg){
        String str1=new String("UIET is a big Engg College");
        StringBuilder str=new StringBuilder("UIET is a big Engg College");
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.replace("UIET","UIET Building"));
        System.out.println(str1.replace("big","Large"));
        System.out.println(str.delete(14, 19));

    }
}
