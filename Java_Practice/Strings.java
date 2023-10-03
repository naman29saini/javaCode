public class Strings {
    public static void main(String [] arg)
    {
        String name1="Naman";
        String name2="Saini";
        //concatination
        String name3=name1+name2;
        System.out.println(name3);
        String name4=name1+" and "+name2;
        System.out.println(name4);

        // charAt
        String name5="Bruno is a good boy";
        System.out.println(name5.charAt(6));
        
        //replace
        String name6="Naman Namna Nanu";
        String name7=name6.replace('N','B');
        System.out.println(name6);
        System.out.println(name7);


        //substring
        String name8="She is a good girl";
        String name9=name8.substring(3,10);
        System.out.println(name9);

        //length
        System.out.println(name4.length());
    }
}
