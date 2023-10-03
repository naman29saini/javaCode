public class Break_Continue {
    public static void main(String [] arg)

{
    int i=1;
    while(true)
    {
        if(i==6)
        {
            i++;
            continue; //break the current loop and skip the next statement and reagain enter the loop
        }
        System.out.println(i);
        i++;
        if(i>10)
        {
            break; //break the loop and come out of the loop
        }
    }
}
}
