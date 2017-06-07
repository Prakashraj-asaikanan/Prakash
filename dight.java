import java.util.*;
public class dight
{
    public static void main(String args[])
    {
        Scanner ne=new Scanner(System.in);
        String s=ne.nextLine();
        //String str[]=s.split(" ");
         String reverse = new StringBuffer(s).reverse().toString();
         int d=Integer.parseInt(reverse);
        
        System.out.println(d);
    
        
    }
}
